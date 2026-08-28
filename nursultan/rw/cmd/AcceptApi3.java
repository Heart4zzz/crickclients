package rw.cmd;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import rw.defs.Enum0052;

public class AcceptApi3 implements ArgumentType<String> {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   public int m2000() {
      return (Integer)this.f2000[2];
   }

   private AcceptApi3(Enum0052 var1, int var2, int var3) {
      this.m42000();
      this.f2000[0] = var1;
      Integer var9 = var2;
      this.f2000[1] = var9;
      Integer var10 = var3;
      this.f2000[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return ((Enum0052)this.f2000[0]).name() + " minLimit: " + (Integer)this.f2000[1] + " maxLimit: " + (Integer)this.f2000[2];
   }

   private static void m8000() {
      f3000 = new String[]{"argument.out-of-bounds"};
   }

   private static void m10000() {
      f1000 = new Object[]{null};
   }

   public Enum0052 m24000() {
      return (Enum0052)this.f2000[0];
   }

   public static AcceptApi3 m26000(int var0, int var1) {
      return new AcceptApi3((Enum0052)Enum0052.f1000[1], var0, var1);
   }

   public static AcceptApi3 m28000(int var0, int var1) {
      return new AcceptApi3((Enum0052)Enum0052.f1000[0], var0, var1);
   }

   public static AcceptApi3 m30000(int var0) {
      return m26000(0, var0);
   }

   public int m34000() {
      return (Integer)this.f2000[1];
   }

   public String m36000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      if (var2.length() <= (Integer)this.f2000[2] && var2.length() >= (Integer)this.f2000[1]) {
         var1 = new StringReader(var2);
         if ((Enum0052)this.f2000[0] == (Enum0052)Enum0052.f1000[1]) {
            String var3 = var1.getRemaining();
            var1.setCursor(var1.getTotalLength());
            return var3;
         } else {
            return (Enum0052)this.f2000[0] == (Enum0052)Enum0052.f1000[0] ? var1.readUnquotedString() : var1.readString();
         }
      } else {
         throw ((DynamicCommandExceptionType)f1000[0]).create(var2);
      }
   }

   private void m42000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
         var1[1] = 0;
         var1[2] = 0;
      }
   }
}
