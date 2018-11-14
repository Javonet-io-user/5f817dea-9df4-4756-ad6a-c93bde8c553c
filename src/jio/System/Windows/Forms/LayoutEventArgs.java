package jio.System.Windows.Forms;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Windows.Forms.*;
import jio.System.ComponentModel.*;public class LayoutEventArgs extends EventArgs {public NObject javonetHandle; public LayoutEventArgs (IComponent affectedComponent,java.lang.String affectedProperty){  super((NObject) null); try {  javonetHandle = Javonet.New("LayoutEventArgs",affectedComponent,affectedProperty); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LayoutEventArgs (Control affectedControl,java.lang.String affectedProperty){  super((NObject) null); try {  javonetHandle = Javonet.New("LayoutEventArgs",affectedControl,affectedProperty); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LayoutEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}