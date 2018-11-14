package RDPCrystalEDILibraryDemo.MaterialSkin.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Forms.*;
import RDPCrystalEDILibraryDemo.MaterialSkin.Controls.*;
import RDPCrystalEDILibraryDemo.MaterialSkin.*;
import jio.System.*;public class MaterialContextMenuStrip extends ContextMenuStrip implements IMaterialControl {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDepth (java.lang.Integer value){ try { javonetHandle.set("Depth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getDepth (){ try { return javonetHandle.get("Depth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public MaterialSkinManager getSkinManager (){ try { return new MaterialSkinManager((NObject)javonetHandle.get("SkinManager"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMouseState (MouseState value){ try { javonetHandle.set("MouseState",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public MouseState getMouseState (){ try { return MouseState.valueOf(((NEnum) javonetHandle.get("MouseState")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public MaterialContextMenuStrip (){  super((NObject) null); try {  javonetHandle = Javonet.New("MaterialContextMenuStrip"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("OnItemClickStart", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ItemClickStart handler : _OnItemClickStartListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ToolStripItemClickedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MaterialContextMenuStrip(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Event
	 */
            private java.util.ArrayList< ItemClickStart> _OnItemClickStartListeners = new java.util.ArrayList<ItemClickStart>();

            public void addOnItemClickStart(ItemClickStart toAdd)
            {
                _OnItemClickStartListeners.add(toAdd);
            }
            public void removeOnItemClickStart(ItemClickStart toRemove)
            {
                _OnItemClickStartListeners.remove(toRemove);
            }public interface ItemClickStart { public void Invoke (NObject sender,ToolStripItemClickedEventArgs e);}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}