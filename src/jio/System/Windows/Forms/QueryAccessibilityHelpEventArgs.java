package jio.System.Windows.Forms;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Windows.Forms.*;public class QueryAccessibilityHelpEventArgs extends EventArgs {public NObject javonetHandle; public QueryAccessibilityHelpEventArgs (){  super((NObject) null); try {  javonetHandle = Javonet.New("QueryAccessibilityHelpEventArgs"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public QueryAccessibilityHelpEventArgs (java.lang.String helpNamespace,java.lang.String helpString,java.lang.String helpKeyword){  super((NObject) null); try {  javonetHandle = Javonet.New("QueryAccessibilityHelpEventArgs",helpNamespace,helpString,helpKeyword); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public QueryAccessibilityHelpEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}