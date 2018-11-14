package RDPCrystalEDILibraryDemo.MaterialSkin.Animations;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibraryDemo.MaterialSkin.Animations.*;public class AnimationCustomQuadratic {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.Double CalculateProgress (java.lang.Double progress){ try { return Javonet.getType("AnimationCustomQuadratic").invoke("CalculateProgress",progress);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}