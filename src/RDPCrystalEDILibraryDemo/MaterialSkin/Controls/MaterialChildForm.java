package RDPCrystalEDILibraryDemo.MaterialSkin.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibraryDemo.MaterialSkin.Controls.*;
import jio.System.*;
import jio.System.Runtime.InteropServices.*;
import RDPCrystalEDILibraryDemo.MaterialSkin.*;
import jio.System.Windows.Forms.*;public class MaterialChildForm extends MaterialForm implements IMaterialControl {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setget_MaterialChildFormMaterialChildFormDepth (java.lang.Integer value){ try { javonetHandle.set("get_MaterialChildFormMaterialChildFormDepth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMaterialChildFormMaterialChildFormDepth (){ try { return javonetHandle.get("MaterialChildFormMaterialChildFormDepth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public MaterialSkinManager getMaterialChildFormMaterialChildFormSkinManager (){ try { return new MaterialSkinManager((NObject)javonetHandle.get("MaterialChildFormMaterialChildFormSkinManager"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setget_MaterialChildFormMaterialChildFormMouseState (MouseState value){ try { javonetHandle.set("get_MaterialChildFormMaterialChildFormMouseState",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public MouseState getMaterialChildFormMaterialChildFormMouseState (){ try { return MouseState.valueOf(((NEnum) javonetHandle.get("MaterialChildFormMaterialChildFormMouseState")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setget_MaterialChildFormMaterialChildFormFormBorderStyle (FormBorderStyle value){ try { javonetHandle.set("get_MaterialChildFormMaterialChildFormFormBorderStyle",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FormBorderStyle getMaterialChildFormMaterialChildFormFormBorderStyle (){ try { return FormBorderStyle.valueOf(((NEnum) javonetHandle.get("MaterialChildFormMaterialChildFormFormBorderStyle")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setget_MaterialChildFormMaterialChildFormSizable (java.lang.Boolean value){ try { javonetHandle.set("get_MaterialChildFormMaterialChildFormSizable",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getMaterialChildFormMaterialChildFormSizable (){ try { return javonetHandle.get("MaterialChildFormMaterialChildFormSizable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetFiled
	 */
            public static java.lang.Integer getWM_NCLBUTTONDOWN (){ try { return Javonet.getType("MaterialChildForm").get("WM_NCLBUTTONDOWN");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setWM_NCLBUTTONDOWN (java.lang.Integer param){ try { Javonet.getType("MaterialChildForm").set("WM_NCLBUTTONDOWN",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getHT_CAPTION (){ try { return Javonet.getType("MaterialChildForm").get("HT_CAPTION");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setHT_CAPTION (java.lang.Integer param){ try { Javonet.getType("MaterialChildForm").set("HT_CAPTION",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getWM_MOUSEMOVE (){ try { return Javonet.getType("MaterialChildForm").get("WM_MOUSEMOVE");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setWM_MOUSEMOVE (java.lang.Integer param){ try { Javonet.getType("MaterialChildForm").set("WM_MOUSEMOVE",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getWM_LBUTTONDOWN (){ try { return Javonet.getType("MaterialChildForm").get("WM_LBUTTONDOWN");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setWM_LBUTTONDOWN (java.lang.Integer param){ try { Javonet.getType("MaterialChildForm").set("WM_LBUTTONDOWN",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getWM_LBUTTONUP (){ try { return Javonet.getType("MaterialChildForm").get("WM_LBUTTONUP");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setWM_LBUTTONUP (java.lang.Integer param){ try { Javonet.getType("MaterialChildForm").set("WM_LBUTTONUP",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getWM_LBUTTONDBLCLK (){ try { return Javonet.getType("MaterialChildForm").get("WM_LBUTTONDBLCLK");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setWM_LBUTTONDBLCLK (java.lang.Integer param){ try { Javonet.getType("MaterialChildForm").set("WM_LBUTTONDBLCLK",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.Integer getWM_RBUTTONDOWN (){ try { return Javonet.getType("MaterialChildForm").get("WM_RBUTTONDOWN");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public static void setWM_RBUTTONDOWN (java.lang.Integer param){ try { Javonet.getType("MaterialChildForm").set("WM_RBUTTONDOWN",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MaterialChildForm (){  super((NObject) null); try {  javonetHandle = Javonet.New("MaterialChildForm"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MaterialChildForm(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.Integer SendMessage (java.lang.Integer hWnd,java.lang.Integer Msg,java.lang.Integer wParam,java.lang.Integer lParam){ try { return Javonet.getType("MaterialChildForm").invoke("SendMessage",hWnd,Msg,wParam,lParam);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Boolean ReleaseCapture (){ try { return Javonet.getType("MaterialChildForm").invoke("ReleaseCapture");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Integer TrackPopupMenuEx (java.lang.Integer hmenu,java.lang.Long fuFlags,java.lang.Integer x,java.lang.Integer y,java.lang.Integer hwnd,java.lang.Integer lptpm){ try { return Javonet.getType("MaterialChildForm").invoke("TrackPopupMenuEx",hmenu,fuFlags,x,y,hwnd,lptpm);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Integer GetSystemMenu (java.lang.Integer hWnd,java.lang.Boolean bRevert){ try { return Javonet.getType("MaterialChildForm").invoke("GetSystemMenu",hWnd,bRevert);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Integer MonitorFromWindow (java.lang.Integer hwnd,java.lang.Long dwFlags){ try { return Javonet.getType("MaterialChildForm").invoke("MonitorFromWindow",hwnd,dwFlags);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Boolean GetMonitorInfo (HandleRef hmonitor,MONITORINFOEX info){ try { return Javonet.getType("MaterialChildForm").invoke("GetMonitorInfo",hmonitor,info);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public static class MONITORINFOEX {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getcbSize (){ try { return javonetHandle.get("cbSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setcbSize (java.lang.Integer param){ try { javonetHandle.set("cbSize",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public RECT getrcMonitor (){ try { return javonetHandle.get("rcMonitor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setrcMonitor (RECT param){ try { javonetHandle.set("rcMonitor",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public RECT getrcWork (){ try { return javonetHandle.get("rcWork");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setrcWork (RECT param){ try { javonetHandle.set("rcWork",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getdwFlags (){ try { return javonetHandle.get("dwFlags");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setdwFlags (java.lang.Integer param){ try { javonetHandle.set("dwFlags",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Character[] getszDevice (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.get("szDevice"),java.lang.Character[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setszDevice (java.lang.Character[] param){ try { javonetHandle.set("szDevice",new Object[] {param});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MONITORINFOEX (){ try {  javonetHandle = Javonet.New("MONITORINFOEX");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MONITORINFOEX(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }}public static class RECT extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Integer getleft (){ try { return javonetHandle.get("left");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setleft (java.lang.Integer param){ try { javonetHandle.set("left",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer gettop (){ try { return javonetHandle.get("top");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void settop (java.lang.Integer param){ try { javonetHandle.set("top",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getright (){ try { return javonetHandle.get("right");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setright (java.lang.Integer param){ try { javonetHandle.set("right",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getbottom (){ try { return javonetHandle.get("bottom");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setbottom (java.lang.Integer param){ try { javonetHandle.set("bottom",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RECT(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer Width (){ try { return javonetHandle.invoke("Width");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer Height (){ try { return javonetHandle.invoke("Height");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}