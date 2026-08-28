package net.minecraft.util.profiling;

import KDFzREm.NNNNF;
import KDFzREm.NNPD;
import java.util.function.Supplier;

public class ProfilerFiller$CombinedProfileFiller implements NNPD {
   private final NNPD N;
   private final NNPD L;

   public void L() {
      this.N.L();
      this.L.L();
   }

   public void L(String var1) {
      this.N.L(var1);
      this.L.L(var1);
   }

   public ProfilerFiller$CombinedProfileFiller(NNPD var1, NNPD var2) {
      this.N = var1;
      this.L = var2;
   }

   public void y(String var1) {
      this.N.y(var1);
      this.L.y(var1);
   }

   public void y(Supplier<String> var1) {
      this.N.y(var1);
      this.L.y(var1);
   }

   public void y() {
      this.N.y();
      this.L.y();
   }

   public void push(Supplier<String> var1, int var2) {
      this.N.N(var1, var2);
      this.L.N(var1, var2);
   }

   public void N() {
      this.N.N();
      this.L.N();
   }

   public void push(long var1) {
      this.N.N(var1);
      this.L.N(var1);
   }

   public void push(int var1) {
      this.N.N(var1);
      this.L.N(var1);
   }

   public void N(NNNNF var1) {
      this.N.N(var1);
      this.L.N(var1);
   }

   public void N(Supplier<String> var1) {
      this.N.N(var1);
      this.L.N(var1);
   }

   public void N(String var1) {
      this.N.N(var1);
      this.L.N(var1);
   }

   public void push(String var1, int var2) {
      this.N.N(var1, var2);
      this.L.N(var1, var2);
   }
}
