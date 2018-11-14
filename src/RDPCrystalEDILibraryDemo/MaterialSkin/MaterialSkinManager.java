package RDPCrystalEDILibraryDemo.MaterialSkin;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibraryDemo.MaterialSkin.*;
import jio.System.Drawing.*;
import RDPCrystalEDILibraryDemo.MaterialSkin.Controls.*;public class MaterialSkinManager {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTheme (Themes value){ try { javonetHandle.set("Theme",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Themes getTheme (){ try { return Themes.valueOf(((NEnum) javonetHandle.get("Theme")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setColorScheme (ColorScheme value){ try { javonetHandle.set("ColorScheme",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ColorScheme getColorScheme (){ try { return new ColorScheme((NObject)javonetHandle.get("ColorScheme"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public static MaterialSkinManager getInstance (){ try { return new MaterialSkinManager((NObject)Javonet.getType("MaterialSkinManager").get("Instance"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public Color getACTION_BAR_TEXT (){ try { return javonetHandle.get("ACTION_BAR_TEXT");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setACTION_BAR_TEXT (Color param){ try { javonetHandle.set("ACTION_BAR_TEXT",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Brush getACTION_BAR_TEXT_BRUSH (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("ACTION_BAR_TEXT_BRUSH"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setACTION_BAR_TEXT_BRUSH (Brush param){ try { javonetHandle.set("ACTION_BAR_TEXT_BRUSH",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Color getACTION_BAR_TEXT_SECONDARY (){ try { return javonetHandle.get("ACTION_BAR_TEXT_SECONDARY");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setACTION_BAR_TEXT_SECONDARY (Color param){ try { javonetHandle.set("ACTION_BAR_TEXT_SECONDARY",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Brush getACTION_BAR_TEXT_SECONDARY_BRUSH (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("ACTION_BAR_TEXT_SECONDARY_BRUSH"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setACTION_BAR_TEXT_SECONDARY_BRUSH (Brush param){ try { javonetHandle.set("ACTION_BAR_TEXT_SECONDARY_BRUSH",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Font getROBOTO_MEDIUM_12 (){ try { return new Font((NObject)javonetHandle.get("ROBOTO_MEDIUM_12"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setROBOTO_MEDIUM_12 (Font param){ try { javonetHandle.set("ROBOTO_MEDIUM_12",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Font getROBOTO_REGULAR_11 (){ try { return new Font((NObject)javonetHandle.get("ROBOTO_REGULAR_11"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setROBOTO_REGULAR_11 (Font param){ try { javonetHandle.set("ROBOTO_REGULAR_11",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Font getROBOTO_MEDIUM_11 (){ try { return new Font((NObject)javonetHandle.get("ROBOTO_MEDIUM_11"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setROBOTO_MEDIUM_11 (Font param){ try { javonetHandle.set("ROBOTO_MEDIUM_11",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Font getROBOTO_MEDIUM_10 (){ try { return new Font((NObject)javonetHandle.get("ROBOTO_MEDIUM_10"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setROBOTO_MEDIUM_10 (Font param){ try { javonetHandle.set("ROBOTO_MEDIUM_10",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Integer getFORM_PADDING (){ try { return javonetHandle.get("FORM_PADDING");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetFiled
	 */
            public void setFORM_PADDING (java.lang.Integer param){ try { javonetHandle.set("FORM_PADDING",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Color getSECONDARY_TEXT_BLACK (){ try { return Javonet.getType("MaterialSkinManager").get("SECONDARY_TEXT_BLACK");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSECONDARY_TEXT_BLACK (Color param){ try { Javonet.getType("MaterialSkinManager").set("SECONDARY_TEXT_BLACK",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Brush getSECONDARY_TEXT_BLACK_BRUSH (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("MaterialSkinManager").get("SECONDARY_TEXT_BLACK_BRUSH"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSECONDARY_TEXT_BLACK_BRUSH (Brush param){ try { Javonet.getType("MaterialSkinManager").set("SECONDARY_TEXT_BLACK_BRUSH",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Color getSECONDARY_TEXT_WHITE (){ try { return Javonet.getType("MaterialSkinManager").get("SECONDARY_TEXT_WHITE");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSECONDARY_TEXT_WHITE (Color param){ try { Javonet.getType("MaterialSkinManager").set("SECONDARY_TEXT_WHITE",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Brush getSECONDARY_TEXT_WHITE_BRUSH (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("MaterialSkinManager").get("SECONDARY_TEXT_WHITE_BRUSH"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSECONDARY_TEXT_WHITE_BRUSH (Brush param){ try { Javonet.getType("MaterialSkinManager").set("SECONDARY_TEXT_WHITE_BRUSH",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MaterialSkinManager(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public Color GetPrimaryTextColor (){ try { return javonetHandle.invoke("GetPrimaryTextColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetPrimaryTextBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetPrimaryTextBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetSecondaryTextColor (){ try { return javonetHandle.invoke("GetSecondaryTextColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetSecondaryTextBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetSecondaryTextBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetDisabledOrHintColor (){ try { return javonetHandle.invoke("GetDisabledOrHintColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetDisabledOrHintBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetDisabledOrHintBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetDividersColor (){ try { return javonetHandle.invoke("GetDividersColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetDividersBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetDividersBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetCheckboxOffColor (){ try { return javonetHandle.invoke("GetCheckboxOffColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetCheckboxOffBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetCheckboxOffBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetCheckBoxOffDisabledColor (){ try { return javonetHandle.invoke("GetCheckBoxOffDisabledColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetCheckBoxOffDisabledBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetCheckBoxOffDisabledBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetRaisedButtonBackgroundBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRaisedButtonBackgroundBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetRaisedButtonTextBrush (java.lang.Boolean primary){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRaisedButtonTextBrush",primary));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetFlatButtonHoverBackgroundColor (){ try { return javonetHandle.invoke("GetFlatButtonHoverBackgroundColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetFlatButtonHoverBackgroundBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFlatButtonHoverBackgroundBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetFlatButtonPressedBackgroundColor (){ try { return javonetHandle.invoke("GetFlatButtonPressedBackgroundColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetFlatButtonPressedBackgroundBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFlatButtonPressedBackgroundBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetFlatButtonDisabledTextBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetFlatButtonDisabledTextBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Brush GetCmsSelectedItemBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetCmsSelectedItemBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Color GetApplicationBackgroundColor (){ try { return javonetHandle.invoke("GetApplicationBackgroundColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void AddFormToManage (MaterialForm materialForm){ try { javonetHandle.invoke("AddFormToManage",materialForm);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RemoveFormToManage (MaterialForm materialForm){ try { javonetHandle.invoke("RemoveFormToManage",materialForm);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } } public enum Themes{LIGHT(0L),DARK(1L),; private long numVal;Themes(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}