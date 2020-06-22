package home.servlet.filemanage;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;

@WebServlet(urlPatterns = "/fileManage/upload")
public class FileuploadServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			File baseDir = new File("D:/upload");// 파일 저장될 폴더 객체
			baseDir.mkdirs(); // 없으면 만들어라!

			int limit = 10 * 1024 * 1024;// 10MB

//			생성을 도와주는 도구 생성(factory)
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}
}
