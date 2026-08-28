package rw.cmd;

import KDFzREm.NPh;
import KDFzREm.Nog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import rw.NursultanClient;
import rw.core.C1188;
import rw.core.OlijtlOl;
import rw.setting.C0106;

public class C0028 extends Socket {
   private static boolean[] f1000;
   private static String[] f2000;

   private static void m2000() {
      f1000 = new boolean[]{true, false, true, false, true};
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"prefix", "prefix", " '%s'", "prefix", "prefix"};
   }

   private RequiredArgumentBuilder<Nog, Character> m8000() {
      return (RequiredArgumentBuilder<Nog, Character>)this.N(f2000[3], new C0032()).executes(var1 -> this.m12000(C0032.m30000(var1, f2000[4])));
   }

   public void m12000(CommandDispatcher<Nog> var1) {
      var1.register((LiteralArgumentBuilder)this.N(f2000[0]).then(this.m8000()));
   }

   private int m12000(char var1) {
      Character var6 = var1;
      C0013.f1000[1] = var6;
      C0106.m32000(C1188.m16000(f2000[1], f2000[2].formatted(var1)).N(NPh.field_1080));
      NursultanClient.m82000().m56000(OlijtlOl.m4000());
      return 1;
   }
}
