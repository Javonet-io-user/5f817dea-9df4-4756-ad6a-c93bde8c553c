package jio.System.Windows.Forms;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Windows.Forms.*;public class QueryContinueDragEventArgs extends EventArgs {public NObject javonetHandle; public QueryContinueDragEventArgs (java.lang.Integer keyState,java.lang.Boolean escapePressed,DragAction action){  super((NObject) null); try {  javonetHandle = Javonet.New("QueryContinueDragEventArgs",keyState,escapePressed,NEnum.fromJavaEnum(action)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public QueryContinueDragEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}