package RDPCrystalEDILibraryDemo.MaterialSkin.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibraryDemo.MaterialSkin.Controls.*;
import jio.System.Windows.Forms.*;
import jio.System.*;public class MouseMessageFilter implements IMessageFilter {protected NObject javonetHandle; public MouseMessageFilter (){ try {  javonetHandle = Javonet.New("MouseMessageFilter");javonetHandle.addEventListener("MouseMove", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (MouseEventHandler handler : _MouseMoveListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], MouseEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MouseMessageFilter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean PreFilterMessage (Message m){ try { return javonetHandle.invoke("PreFilterMessage",m);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Event
	 */
            private java.util.ArrayList< MouseEventHandler> _MouseMoveListeners = new java.util.ArrayList<MouseEventHandler>();

            public void addMouseMove(MouseEventHandler toAdd)
            {
                _MouseMoveListeners.add(toAdd);
            }
            public void removeMouseMove(MouseEventHandler toRemove)
            {
                _MouseMoveListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}