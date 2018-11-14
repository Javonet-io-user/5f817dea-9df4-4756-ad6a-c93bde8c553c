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
import jio.System.Drawing.*;public class MaterialListView extends ListView implements IMaterialControl {protected NObject javonetHandle; /**
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
            public MouseState getMouseState (){ try { return MouseState.valueOf(((NEnum) javonetHandle.get("MouseState")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMouseLocation (Point value){ try { javonetHandle.set("MouseLocation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Point getMouseLocation (){ try { return javonetHandle.get("MouseLocation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public MaterialListView (){  super((NObject) null); try {  javonetHandle = Javonet.New("MaterialListView"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MaterialListView(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }public static class LogFont {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getlfHeight (){ try { return javonetHandle.get("lfHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfHeight (java.lang.Integer param){ try { javonetHandle.set("lfHeight",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getlfWidth (){ try { return javonetHandle.get("lfWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfWidth (java.lang.Integer param){ try { javonetHandle.set("lfWidth",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getlfEscapement (){ try { return javonetHandle.get("lfEscapement");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfEscapement (java.lang.Integer param){ try { javonetHandle.set("lfEscapement",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getlfOrientation (){ try { return javonetHandle.get("lfOrientation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfOrientation (java.lang.Integer param){ try { javonetHandle.set("lfOrientation",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getlfWeight (){ try { return javonetHandle.get("lfWeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfWeight (java.lang.Integer param){ try { javonetHandle.set("lfWeight",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfItalic (){ try { return javonetHandle.get("lfItalic");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfItalic (java.lang.Byte param){ try { javonetHandle.set("lfItalic",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfUnderline (){ try { return javonetHandle.get("lfUnderline");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfUnderline (java.lang.Byte param){ try { javonetHandle.set("lfUnderline",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfStrikeOut (){ try { return javonetHandle.get("lfStrikeOut");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfStrikeOut (java.lang.Byte param){ try { javonetHandle.set("lfStrikeOut",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfCharSet (){ try { return javonetHandle.get("lfCharSet");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfCharSet (java.lang.Byte param){ try { javonetHandle.set("lfCharSet",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfOutPrecision (){ try { return javonetHandle.get("lfOutPrecision");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfOutPrecision (java.lang.Byte param){ try { javonetHandle.set("lfOutPrecision",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfClipPrecision (){ try { return javonetHandle.get("lfClipPrecision");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfClipPrecision (java.lang.Byte param){ try { javonetHandle.set("lfClipPrecision",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfQuality (){ try { return javonetHandle.get("lfQuality");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfQuality (java.lang.Byte param){ try { javonetHandle.set("lfQuality",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Byte getlfPitchAndFamily (){ try { return javonetHandle.get("lfPitchAndFamily");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setlfPitchAndFamily (java.lang.Byte param){ try { javonetHandle.set("lfPitchAndFamily",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getlfFaceName (){ try { return  (java.lang.String) javonetHandle.get("lfFaceName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setlfFaceName (java.lang.String param){ try { javonetHandle.set("lfFaceName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LogFont (){ try {  javonetHandle = Javonet.New("LogFont");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LogFont(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}