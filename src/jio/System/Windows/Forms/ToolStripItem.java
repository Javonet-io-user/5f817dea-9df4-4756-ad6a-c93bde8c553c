package jio.System.Windows.Forms;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import jio.System.Windows.Forms.*;
import jio.System.*;public abstract class ToolStripItem extends Component implements IDropTarget {protected NObject javonetHandle; public ToolStripItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void OnDragEnter (DragEventArgs dragEvent){ try { javonetHandle.invoke("OnDragEnter",dragEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnDragLeave (EventArgs e){ try { javonetHandle.invoke("OnDragLeave",e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnDragDrop (DragEventArgs dragEvent){ try { javonetHandle.invoke("OnDragDrop",dragEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnDragOver (DragEventArgs dragEvent){ try { javonetHandle.invoke("OnDragOver",dragEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}