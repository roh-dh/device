package home.servlet.board;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import home.beans.dao.BoardDao;
import home.beans.dao.BoardFileDao;
import home.beans.dto.BoardDto;
import home.beans.dto.BoardFileDto;
import home.beans.dto.MemberDto;

@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteWithFileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			목표 : multipart/form-data 방식으로 전송되는 게시글 +파일을 해석 및 저장

//			1.해석을 위한 도구를 생성할 옵션		
			String charset ="UTF-8"; //해석할 인코딩 방식
			int limit = 10* 1024* 1024; //최대 허용 용량
			File baseDir = new File("D:/upload/board");
			baseDir.mkdirs();
			
//			2. 도구 생성을 위한 Factory 객체를 생성
			DiskFileItemFactory factory = new DiskFileItemFactory();
					factory.setDefaultCharset(charset); //생성 옵션으로 Charset지정
					factory.setSizeThreshold(limit); //maximum 용량 설정
					factory.setRepository(baseDir); //기본 저장폴더 설정
			
//			3.실제 사용할 도구 설정 
			ServletFileUpload utility = new ServletFileUpload(factory);	
			
//			4.실제로 데이터를 불러와서 저장
			Map<String,List<FileItem>> map = utility.parseParameterMap(req);
			
//			5.해석한 데이터에서 필요한 정보들을 추출
			BoardDto bdto = new BoardDto();
			bdto.setBoard_head(map.get("board_head").get(0).getString()); 
			// jsp에서 input태그에 board_head를 name으로 받았잖아. 그래서 map.get("board_head")인거고. 
			//그거를 꺼내오는건데  List로 받아온 데이터가 1개밖에 없어서 get(0) List의 가장앞번호인 0을 넣은것.
			//
			
			bdto.setBoard_title(map.get("board_title").get(0).getString());
			bdto.setBoard_content(map.get("board_content").get(0).getString());

//			System.out.println("head = " +bdto.getBoard_head());
//			System.out.println("title = " +bdto.getBoard_title());
//			System.out.println("content = " +bdto.getBoard_content());
			
//			board_no의 전송 유무를 파악한다 board_no는 새글일때는 없고 답글일때만 있다.
//			System.out.println(map.get("board_no"));  null
			System.out.println(map.containsKey("board_no"));  //false
			if(map.containsKey("board_no")) {
				bdto.setSuper_no(Integer.parseInt(map.get("board_no").get(0).getString()));
			}
			
//			6. 세션에서 작성자 정보를 가져오는 코드
			MemberDto user = (MemberDto) req.getSession().getAttribute("userinfo"); //세션을 꺼내와서 user에 대입한다.
			bdto.setBoard_writer(user.getMember_id()); //세션에 있는 아이디를 불러와서   bdto에 게시판작성자를 저장
			
//			7. 작성할 게시글의 번호를 미리 가져온다.
			BoardDao bdao = new BoardDao();				
			int board_no = bdao.getSequence();		
			
//			8.게시글 정보에 7번에서 가져온 번호를 첨부
			bdto.setBoard_no(board_no);
			
//			9.게시글 등록
			bdao.write(bdto);
			
//			10.파일 정보를 불러와서 저장(하드디스크 + 데이터베이스)
//			- 전송되는 이름은 board_file
//			- (주의)파일이 없어도 개수가 1개가 나오므로 개수로 처리하는 것은 무리!
//			- 파일이 있는지 없는지는 파일의 크기를 이용해서 확인!
			
			List<FileItem> fileList = map.get("board_file");
			BoardFileDao bfdao= new BoardFileDao();	
			for(FileItem item : fileList) {
//				item에 있는 정보를 뽑아내서 DB에 저장
//				item의 파일 데이터를 하드디스크에 저장
				System.out.println(item.getSize()); //파일 크기로 확인
				if(item.getSize()>0) {//파일이 있는 경우
					
				//데이터베이스에 저장	  
				int board_file_no = bfdao.getSequence(); //(하드디스크에  저장하기전에 번호를 알아야함)
				
				BoardFileDto bfdto = new BoardFileDto();
				bfdto.setBoard_file_no(board_file_no);//파일번호
				bfdto.setBoard_file_name(item.getName());//파일명
				bfdto.setBoard_file_size(item.getSize());//파일크기
				bfdto.setBoard_file_type(item.getContentType());//파일유형
				bfdto.setBoard_origin(board_no);//게시글 번호
				bfdao.save(bfdto);
				
				
//				하드디스크에 저장함.
				File target = new File(baseDir,String.valueOf(board_file_no));
				item.write(target);
				}	
			}
			
			
			
//			11.상세보기 페이지로 리다이렉트
			resp.sendRedirect("content.jsp?board_no="+board_no);
			
			
		} catch(Exception e){
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}

}
