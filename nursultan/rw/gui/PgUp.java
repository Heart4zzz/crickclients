package rw.gui;

public enum PgUp {
   private static String[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   public static Object[] f4000;
   private static String[] f5000;
   public static Object[] f6000;
   private static String[] f7000;
   private static String[] f8000;
   public static Object[] f9000;
   private static String[] f10000;
   private static String[] f11000;
   public static Object[] f12000;
   private static String[] f13000;
   private static String[] f14000;
   private static String[] f15000;
   public static Object[] f16000;
   private static String[] f17000;
   private static String[] f18000;
   public static Object[] f19000;
   private static String[] f20000;
   public static Object[] f21000;
   private static String[] f22000;
   public static Object[] f23000;
   private static String[] f24000;
   public static Object[] f25000;
   private static String[] f26000;
   private static String[] f27000;
   private static String[] f28000;
   public static Object[] f29000;
   public static Object[] f30000;
   private static String[] f31000;
   public static Object[] f32000;
   private static String[] f33000;
   private static String[] f34000;
   public static Object[] f35000;
   private static String[] f36000;
   private static String[] f37000;
   private static String[] f38000;
   public static Object[] f39000;
   private static String[] f40000;
   public static Object[] f41000;
   private static String[] f42000;
   public static Object[] f43000;
   public static Object[] f44000;
   public static Object[] f45000;
   public static Object[] f46000;
   public static Object[] f47000;
   private static String[] f48000;
   private static String[] f49000;
   private static String[] f50000;
   public static Object[] f51000;
   private static String[] f52000;
   private static String[] f53000;
   private static String[] f54000;
   private static String[] f55000;
   private static String[] f56000;
   public static Object[] f57000;
   private static String[] f58000;
   public static Object[] f59000;
   public static Object[] f60000;
   private static String[] f61000;
   private static String[] f62000;
   public static Object[] f63000;
   private static String[] f64000;
   private static String[] f65000;
   public Object[] f66000;
   private static String[] f67000;
   private static String[] f68000;
   public static Object[] f69000;
   private static String[] f70000;
   private static String[] f71000;
   private static String[] f72000;
   public static Object[] f73000;
   private static String[] f74000;
   public static Object[] f75000;
   private static String[] f76000;
   private static String[] f77000;
   public static Object[] f78000;
   public static Object[] f79000;
   private static String[] f80000;

   public int m8000() {
      return (Integer)OOOktqnn<"vsxxydfb",-2094712980,-914738868,-914738867,-914738866,-2094712980>(this)[0];
   }

   private PgUp(int var3, String var4) {
      this.m26000();
      Integer var9 = var3;
      OOOktqnn<"vsxxydfb",-2094712980,-914738868,-914738867,-914738866,-2094712980>(this)[0] = var9;
      this.f66000[1] = var4;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return (String)this.f66000[1];
   }

   public static PgUp[] m22000() {
      return (PgUp[])((PgUp[])f59000[3]).clone();
   }

   private void m26000() {
      if (this.f66000 == null) {
         this.f66000 = new Object[2];
         Object[] var1 = this.f66000;
         var1[0] = 0;
      }
   }

   private static void m36000() {
      f36000 = new String[]{"UNKNOWN", "None", "MOUSE_1", "M1", "MOUSE_2", "M2"};
      f40000 = new String[]{"MOUSE_3", "M3", "MOUSE_4"};
      f31000 = new String[]{"M4", "MOUSE_5", "M5", "MOUSE_6", "M6"};
      f13000 = new String[]{"MOUSE_7", "M7", "MOUSE_8", "M8"};
      f70000 = new String[]{"SPACE", "Space", "APOSTROPHE", "'", "COMMA"};
      f77000 = new String[]{",", "MINUS", "-", "PERIOD", ".", "SLASH", "/"};
      f56000 = new String[]{"SEMICOLON", ";"};
      f68000 = new String[]{"EQUAL", "=", "DIGIT_0", "0", "DIGIT_1", "1"};
      f55000 = new String[]{"DIGIT_2", "2", "DIGIT_3", "3", "DIGIT_4", "4"};
      f15000 = new String[]{"DIGIT_5", "5", "DIGIT_6", "6", "DIGIT_7", "7", "DIGIT_8", "8"};
      f58000 = new String[]{"DIGIT_9", "9", "A", "A", "B", "B", "C", "C"};
      f50000 = new String[]{"D", "D", "E"};
      f2000 = new String[]{"E", "F", "F", "G"};
      f71000 = new String[]{"G", "H", "H", "I", "I", "J", "J", "K"};
      f62000 = new String[]{"K", "L", "L"};
      f22000 = new String[]{"M", "M", "N", "N", "O", "O"};
      f52000 = new String[]{"P", "P", "Q", "Q"};
      f37000 = new String[]{"R", "R", "S", "S", "T", "T", "U"};
      f61000 = new String[]{"U", "V", "V", "W", "W"};
      f38000 = new String[]{"X", "X", "Y"};
      f14000 = new String[]{"Y", "Z", "Z", "LEFT_BRACKET", "[", "BACKSLASH", "\\", "RIGHT_BRACKET"};
      f48000 = new String[]{"]", "GRAVE_ACCENT", "`", "WORLD_1", "World 1", "WORLD_2", "World 2", "ESCAPE"};
      f80000 = new String[]{"Esc", "ENTER", "Enter", "TAB"};
      f11000 = new String[]{"Tab", "BACKSPACE", "Backspace", "INSERT", "Ins", "DELETE", "Del", "RIGHT"};
      f76000 = new String[]{"Right", "LEFT", "Left", "DOWN", "Down", "UP", "Up", "PAGE_UP"};
      f34000 = new String[]{"PgUp", "PAGE_DOWN", "PgDn", "HOME", "Home", "END", "End", "CAPS_LOCK"};
      f26000 = new String[]{"Caps", "SCROLL_LOCK", "Scroll"};
      f64000 = new String[]{"NUM_LOCK", "Num"};
      f7000 = new String[]{"PRINT_SCREEN", "Print", "PAUSE", "Pause", "F1", "F1", "F2", "F2"};
      f53000 = new String[]{"F3", "F3", "F4", "F4", "F5"};
      f54000 = new String[]{"F5", "F6"};
      f5000 = new String[]{"F6", "F7", "F7"};
      f67000 = new String[]{"F8", "F8", "F9", "F9", "F10", "F10", "F11", "F11"};
      f27000 = new String[]{"F12", "F12", "F13", "F13"};
      f74000 = new String[]{"F14", "F14", "F15", "F15", "F16", "F16", "F17"};
      f72000 = new String[]{"F17", "F18", "F18", "F19", "F19", "F20", "F20"};
      f65000 = new String[]{"F21", "F21"};
      f28000 = new String[]{"F22", "F22", "F23", "F23", "F24"};
      f42000 = new String[]{"F24", "F25", "F25"};
      f10000 = new String[]{"KP_0", "Num 0", "KP_1", "Num 1", "KP_2"};
      f17000 = new String[]{"Num 2", "KP_3", "Num 3", "KP_4", "Num 4", "KP_5"};
      f20000 = new String[]{"Num 5", "KP_6", "Num 6", "KP_7", "Num 7", "KP_8", "Num 8"};
      f24000 = new String[]{"KP_9", "Num 9", "KP_DECIMAL", "Num .", "KP_DIVIDE"};
      f49000 = new String[]{"Num /", "KP_MULTIPLY", "Num *", "KP_SUBTRACT"};
      f18000 = new String[]{"Num -", "KP_ADD", "Num +", "KP_ENTER", "Num Enter"};
      f8000 = new String[]{"KP_EQUAL", "Num =", "LEFT_SHIFT"};
      f33000 = new String[]{"Shift", "LEFT_CONTROL", "Ctrl"};
      f1000 = new String[]{"LEFT_ALT", "Alt", "LEFT_SUPER", "Win", "RIGHT_SHIFT", "RShift", "RIGHT_CONTROL", "RCtrl"};
      f3000 = new String[]{"RIGHT_ALT", "RAlt", "RIGHT_SUPER", "RWin", "MENU", "Menu"};
   }

   private static void m60000() {
      f4000 = new Object[]{null, null, null, null};
      f35000 = new Object[]{null, null, null, null};
      f39000 = new Object[]{null, null, null};
      f25000 = new Object[]{null, null};
      f73000 = new Object[]{null, null};
      f60000 = new Object[]{null, null, null, null, null};
      f30000 = new Object[]{null, null, null, null, null, null};
      f78000 = new Object[]{null, null, null};
      f51000 = new Object[]{null, null, null, null, null};
      f23000 = new Object[]{null, null, null, null};
      f63000 = new Object[]{null, null, null};
      f79000 = new Object[]{null, null, null, null};
      f21000 = new Object[]{null, null, null, null, null};
      f69000 = new Object[]{null, null, null, null, null, null, null, null};
      f16000 = new Object[]{null, null, null, null};
      f75000 = new Object[]{null, null, null, null};
      f12000 = new Object[]{null, null, null, null, null, null, null, null};
      f32000 = new Object[]{null, null, null, null, null, null, null, null};
      f45000 = new Object[]{null, null, null, null, null};
      f47000 = new Object[]{null, null};
      f29000 = new Object[]{null, null};
      f6000 = new Object[]{null, null, null};
      f44000 = new Object[]{null, null, null, null, null};
      f46000 = new Object[]{null, null, null, null, null, null, null, null};
      f9000 = new Object[]{null, null, null, null, null, null, null};
      f19000 = new Object[]{null, null};
      f43000 = new Object[]{null, null};
      f57000 = new Object[]{null, null, null, null};
      f41000 = new Object[]{null, null, null, null, null};
      f59000 = new Object[]{null, null, null, null};
   }

   public String m68000() {
      return (String)this.f66000[1];
   }

   public static PgUp m76000(int var0) {
      if (var0 >= -1 && var0 <= 348) {
         int var1 = 0;
         int var2 = ((PgUp[])f59000[2]).length - 1;

         while (var1 <= var2) {
            int var3 = var1 + var2 >>> 1;
            PgUp var4 = ((PgUp[])f59000[2])[var3];
            int var5 = Integer.compare((Integer)var4.f66000[0], var0);
            if (var5 < 0) {
               var1 = var3 + 1;
            } else {
               if (var5 <= 0) {
                  return var4;
               }

               var2 = var3 - 1;
            }
         }

         return (PgUp)f4000[0];
      } else {
         return (PgUp)f4000[0];
      }
   }

   public boolean m80000() {
      return (boolean)(this == (PgUp)f4000[0] ? 1 : 0);
   }

   public boolean m86000() {
      return (boolean)(this.f66000[0] >= 0 && this.f66000[0] <= 7 ? 1 : 0);
   }

   public boolean m88000(int var1) {
      return (boolean)(this.f66000[0] == var1 ? 1 : 0);
   }

   public boolean m90000(PgUp var1) {
      return (boolean)(this == var1 ? 1 : 0);
   }
}
