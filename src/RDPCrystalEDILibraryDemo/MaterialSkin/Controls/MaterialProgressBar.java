package RDPCrystalEDILibraryDemo.MaterialSkin.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Forms.*;
import RDPCrystalEDILibraryDemo.MaterialSkin.Controls.*;
import RDPCrystalEDILibraryDemo.MaterialSkin.*;public class MaterialProgressBar extends ProgressBar implements IMaterialControl {protected NObject javonetHandle; /**
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
            public MouseState getMouseState (){ try { return MouseState.valueOf(((NEnum) javonetHandle.get("MouseState")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public MaterialProgressBar (){  super((NObject) null); try {  javonetHandle = Javonet.New("MaterialProgressBar"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MaterialProgressBar(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}