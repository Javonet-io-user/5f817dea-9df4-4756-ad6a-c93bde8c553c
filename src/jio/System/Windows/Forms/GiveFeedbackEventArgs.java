package jio.System.Windows.Forms;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Windows.Forms.*;public class GiveFeedbackEventArgs extends EventArgs {public NObject javonetHandle; public GiveFeedbackEventArgs (DragDropEffects effect,java.lang.Boolean useDefaultCursors){  super((NObject) null); try {  javonetHandle = Javonet.New("GiveFeedbackEventArgs",NEnum.fromJavaEnum(effect),useDefaultCursors); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GiveFeedbackEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}