package junit.tutorial.ex03.e02;

import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class LogAnalyzeTest {


		@InjectMocks
		 LogAnalyzer Log;
		@Mock
		 LogLoader mockLogLorder;
		private static final String fileNae="file1";
		@Test
		void test() throws Exception {
			//LogLOaderのloadメソッドが呼び出された時にIOExpceptionを送出したなら
			//AnalyzeExceptionが送出される。そしてエラーメッセージが表示される
			doReturn(new analyze(fileNae)).
			
			
	}
		

}
