package RDPCrystalEDILibraryDemo.MaterialSkin;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibraryDemo.MaterialSkin.*;
import jio.System.Drawing.*;public class ColorScheme {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public Color getPrimaryColor (){ try { return javonetHandle.get("PrimaryColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPrimaryColor (Color param){ try { javonetHandle.set("PrimaryColor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Color getDarkPrimaryColor (){ try { return javonetHandle.get("DarkPrimaryColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDarkPrimaryColor (Color param){ try { javonetHandle.set("DarkPrimaryColor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Color getLightPrimaryColor (){ try { return javonetHandle.get("LightPrimaryColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLightPrimaryColor (Color param){ try { javonetHandle.set("LightPrimaryColor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Color getAccentColor (){ try { return javonetHandle.get("AccentColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAccentColor (Color param){ try { javonetHandle.set("AccentColor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Color getTextColor (){ try { return javonetHandle.get("TextColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTextColor (Color param){ try { javonetHandle.set("TextColor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Pen getPrimaryPen (){ try { return new Pen((NObject)javonetHandle.get("PrimaryPen"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPrimaryPen (Pen param){ try { javonetHandle.set("PrimaryPen",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Pen getDarkPrimaryPen (){ try { return new Pen((NObject)javonetHandle.get("DarkPrimaryPen"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDarkPrimaryPen (Pen param){ try { javonetHandle.set("DarkPrimaryPen",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Pen getLightPrimaryPen (){ try { return new Pen((NObject)javonetHandle.get("LightPrimaryPen"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLightPrimaryPen (Pen param){ try { javonetHandle.set("LightPrimaryPen",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Pen getAccentPen (){ try { return new Pen((NObject)javonetHandle.get("AccentPen"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAccentPen (Pen param){ try { javonetHandle.set("AccentPen",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Pen getTextPen (){ try { return new Pen((NObject)javonetHandle.get("TextPen"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTextPen (Pen param){ try { javonetHandle.set("TextPen",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Brush getPrimaryBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("PrimaryBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPrimaryBrush (Brush param){ try { javonetHandle.set("PrimaryBrush",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Brush getDarkPrimaryBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("DarkPrimaryBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setDarkPrimaryBrush (Brush param){ try { javonetHandle.set("DarkPrimaryBrush",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Brush getLightPrimaryBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("LightPrimaryBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLightPrimaryBrush (Brush param){ try { javonetHandle.set("LightPrimaryBrush",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Brush getAccentBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("AccentBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setAccentBrush (Brush param){ try { javonetHandle.set("AccentBrush",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Brush getTextBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("TextBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTextBrush (Brush param){ try { javonetHandle.set("TextBrush",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ColorScheme (Primary primary,Primary darkPrimary,Primary lightPrimary,Accent accent,TextShade textShade){ try {  javonetHandle = Javonet.New("ColorScheme",NEnum.fromJavaEnum(primary),NEnum.fromJavaEnum(darkPrimary),NEnum.fromJavaEnum(lightPrimary),NEnum.fromJavaEnum(accent),NEnum.fromJavaEnum(textShade));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ColorScheme(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}