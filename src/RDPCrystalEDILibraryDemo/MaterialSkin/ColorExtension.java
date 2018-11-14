package RDPCrystalEDILibraryDemo.MaterialSkin;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibraryDemo.MaterialSkin.*;
import jio.System.Drawing.*;public class ColorExtension {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static Color ToColor (java.lang.Integer argb){ try { return Javonet.getType("ColorExtension").invoke("ToColor",argb);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static Color RemoveAlpha (Color color){ try { return Javonet.getType("ColorExtension").invoke("RemoveAlpha",color);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Integer PercentageToColorComponent (java.lang.Integer percentage){ try { return Javonet.getType("ColorExtension").invoke("PercentageToColorComponent",percentage);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}