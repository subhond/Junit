package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//LogLOaderのloadメソッドが呼び出された時にIOExpceptionを送出したなら
//AnalyzeExceptionが送出される。そしてエラーメッセージが表示される
class LogAnalyzerTest {
	@ExtendWith(MockitoExtension.class)
	//@InjectMocks→Mockを入れるクラス
	//@Mock→Mockとして使うクラス
		@InjectMocks
		 LogAnalyzer Log;
		@Mock
		 LogLoader mockLogLorder;
		private static final String file="file1";
		@Test
		void test() throws Exception {
			
		
			doReturn(new Object()).when(mockLogLorder).load(file);
			
			analyze result=Log.analyze(file);
			assertEquals(file,result.getfile());
			
			
			
		
		
	}

}
