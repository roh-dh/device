package study.servlet.filemanage;

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

@WebServlet(urlPatterns = "/filemanage/upload2.do")
public class FileUploadServlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			목표 : 원래 우리가 사용하던 것처럼 "이름"으로 접근하여 데이터를 추출
			File baseDir = new File("D:/upload");//저장할 위치
			baseDir.mkdirs();
			int limit = 10 * 1024 * 1024;
			String charset = "UTF-8";
			
//			생성
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(baseDir);
			factory.setSizeThreshold(limit);
			factory.setDefaultCharset(charset);
			
//			factory의 정보를 기반으로 도구를 생성하여 utility라고 부른다
			ServletFileUpload utility = new ServletFileUpload(factory);
			
//			utility를 이용하여 요청을 분석
			Map<String, List<FileItem>> map = utility.parseParameterMap(req); //list로 접근하면 순서로 접근하는데 map을 이용해서 이름으로 접근할수있게해
			System.out.println(map);
			
//			파라미터는 일반적으로 1개 데이터만 넘어온다
			String uploader = map.get("uploader").get(0).getString();
			System.out.println("uploader = " + uploader);
			
//			파일은 multiple 옵션이 있을 때와 없을 때 전송형태가 달라진다
//			- 둘 다 여러개라고 생각하고 반복문으로 처리하는 것이 가장 좋다
			List<FileItem> list = map.get("f");
			for(FileItem item : list) {
				//item을 저장하면 된다!(정보는 데이터베이스에 저장)
				//(주의) 파일 크기가 0이면 저장을 안함
				if(item.getSize() > 0) {
					//실제 파일 저장 코드
					File target = new File(baseDir, item.getName());
					item.write(target);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
