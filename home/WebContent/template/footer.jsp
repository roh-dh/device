<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    					<br>
					</td>
				</tr>
				<!-- 하단(footer) 영역 -->
				<tr height="100">
					<td align="center">
					
						<h5>
							<i>KH 정보교육원 디바이스/웹 콘텐츠 융합 디지털 컨버전스 양성과정</i>
						</h5>
						
						<!-- 사용자의 로그인 정보를 분석하는 코드 작성(연습용) -->
						<h6>세션ID : <%=session.getId()%></h6>
						<h6>userinfo : <%=session.getAttribute("userinfo")%></h6>
						<h6>로그인 : <%=session.getAttribute("userinfo") != null%></h6>
					</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>