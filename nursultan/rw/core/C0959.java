package rw.core;

import fun.crashsystem.jdrpc.entity.User;

public class C0959 {
   private static boolean[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;
   private static byte[] f5000;
   private static byte[] f6000;
   private static boolean[] f7000;
   public Object[] f8000;
   private static boolean[] f9000;
   private static byte[] f10000;

   public void m2000(int var1) {
      Integer var6 = var1;
      this.f8000[1] = var6;
   }

   public int m4000() {
      return (Integer)this.f8000[1];
   }

   public void m6000(String var1) {
      this.f4000[2] = var1;
   }

   public int m8000() {
      return (Integer)this.f4000[0];
   }

   public C0959() {
      this.m28000();
      Integer var5 = Integer.valueOf(f6000[0]);
      this.f8000[1] = var5;
      Integer var6 = Integer.valueOf(f6000[1]);
      this.f8000[2] = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m14000(Object var1) {
      if (var1 == this) {
         return (boolean)1;
      } else if (!(var1 instanceof C0959 var2)) {
         return (boolean)0;
      } else if (!var2.m60000(this)) {
         return (boolean)0;
      } else if (this.m8000() != var2.m8000()) {
         return (boolean)0;
      } else if (this.m68000() != var2.m68000()) {
         return (boolean)0;
      } else if (this.m32000() != var2.m32000()) {
         return (boolean)0;
      } else if (this.m4000() != var2.m4000()) {
         return (boolean)0;
      } else if (this.m30000() != var2.m30000()) {
         return (boolean)0;
      } else {
         String var3 = this.m20000();
         String var4 = var2.m20000();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.m16000();
            String var6 = var2.m16000();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.m42000();
               String var8 = var2.m42000();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  C1145 var9 = this.m22000();
                  C1145 var10 = var2.m22000();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     String var11 = this.m38000();
                     String var12 = var2.m38000();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        User var13 = this.m62000();
                        User var14 = var2.m62000();
                        return (boolean)((var13 == null ? var14 == null : var13.equals(var14)) ? 1 : 0);
                     } else {
                        return (boolean)0;
                     }
                  } else {
                     return (boolean)0;
                  }
               } else {
                  return (boolean)0;
               }
            } else {
               return (boolean)0;
            }
         } else {
            return (boolean)0;
         }
      }
   }

   @Override
   public String toString() {
      return "ClientUser(uid="
         + this.m8000()
         + ", username="
         + this.m20000()
         + ", apiToken="
         + this.m16000()
         + ", hasPremium="
         + this.m68000()
         + ", subscribeTimeMinutes="
         + this.m32000()
         + ", hash="
         + this.m42000()
         + ", role="
         + this.m22000()
         + ", prefixIndex="
         + this.m4000()
         + ", avatarTextureId="
         + this.m30000()
         + ", avatarBase64="
         + this.m38000()
         + ", discordUser="
         + this.m62000()
         + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = f6000[2];
      int var2 = 1;
      var2 = var2 * f6000[3] + this.m8000();
      var2 = var2 * f6000[4] + (this.m68000() ? f6000[5] : 97);
      long var3 = this.m32000();
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      var2 = var2 * 59 + this.m4000();
      var2 = var2 * 59 + this.m30000();
      String var5 = this.m20000();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      String var6 = this.m16000();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      String var7 = this.m42000();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      C1145 var8 = this.m22000();
      var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
      String var9 = this.m38000();
      var2 = var2 * 59 + (var9 == null ? 43 : var9.hashCode());
      User var10 = this.m62000();
      return var2 * 59 + (var10 == null ? 43 : var10.hashCode());
   }

   public String m16000() {
      return (String)this.f4000[2];
   }

   public String m20000() {
      return (String)this.f4000[1];
   }

   public C1145 m22000() {
      return (C1145)this.f8000[0];
   }

   private static void m26000() {
      f3000 = new boolean[]{true, false};
      f1000 = new boolean[]{false, false, false, false, false, false};
      f7000 = new boolean[]{false, false, false, false, false, false, true, true};
      f9000 = new boolean[]{false, false, false, true, false, false};
   }

   private void m28000() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:326)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:134)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:220)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 6
      // 03: anewarray 4
      // 06: checkcast [Ljava/lang/Object;
      // 09: putfield rw/core/C0959.f4000 [Ljava/lang/Object;
      // 0c: aload 0
      // 0d: bipush 5
      // 0e: anewarray 4
      // 11: checkcast [Ljava/lang/Object;
      // 14: putfield rw/core/C0959.f8000 [Ljava/lang/Object;
      // 17: aload 0
      // 18: getfield rw/core/C0959.f4000 [Ljava/lang/Object;
      // 1b: getstatic rw/core/C0959.f9000 [Z
      // 1e: baload
      // 1f: bipush 0
      // 20: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23: aastore
      // 24: aload 0
      // 25: getfield rw/core/C0959.f8000 [Ljava/lang/Object;
      // 28: bipush 1
      // 29: bipush 0
      // 2a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2d: aastore
      // 2e: aload 0
      // 2f: getfield rw/core/C0959.f4000 [Ljava/lang/Object;
      // 32: bipush 3
      // 33: bipush 0
      // 34: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 37: aastore
      // 38: aload 0
      // 39: getfield rw/core/C0959.f8000 [Ljava/lang/Object;
      // 3c: bipush 2
      // 3d: bipush 0
      // 3e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 41: aastore
      // 42: aload 0
      // 43: getfield rw/core/C0959.f4000 [Ljava/lang/Object;
      // 46: bipush 4
      // 47: lconst_0
      // 48: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b: aastore
      // 4c: return
   }

   public int m30000() {
      return (Integer)this.f8000[2];
   }

   public long m32000() {
      return (Long)this.f4000[4];
   }

   public void m36000(String var1) {
      this.f4000[5] = var1;
   }

   public String m38000() {
      return (String)this.f8000[3];
   }

   public void m40000(int var1) {
      Integer var6 = var1;
      this.f4000[0] = var6;
   }

   public String m42000() {
      return (String)this.f4000[5];
   }

   public void m44000(String var1) {
      this.f8000[3] = var1;
   }

   private static void m48000() {
      f6000 = new byte[]{-1, -1, 59, 59, 59, 79};
      f5000 = new byte[]{97, 59, 32, 59, 59, 59, 43, 59};
      f10000 = new byte[]{43, 59, 43, 59, 43, 59, 43};
      f2000 = new byte[]{59, 43, 6, 3, 4, 5, 2};
   }

   public void m50000(long var1) {
      Long var7 = var1;
      this.f4000[4] = var7;
   }

   public void m52000(User var1) {
      this.f8000[4] = var1;
   }

   public void m54000(int var1) {
      Integer var6 = var1;
      this.f8000[2] = var6;
   }

   public void m56000(String var1) {
      this.f4000[1] = var1;
   }

   public void m58000(boolean var1) {
      Boolean var6 = var1;
      this.f4000[3] = var6;
   }

   public boolean m60000(Object var1) {
      return var1 instanceof C0959;
   }

   public User m62000() {
      return (User)this.f8000[4];
   }

   public void m64000(C1145 var1) {
      this.f8000[0] = var1;
   }

   public boolean m68000() {
      return (Boolean)this.f4000[3];
   }
}
