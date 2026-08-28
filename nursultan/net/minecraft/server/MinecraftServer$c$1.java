package net.minecraft.server;

import KDFzREm.NNNNst;
import KDFzREm.NNPr;
import KDFzREm.NNWP;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

class MinecraftServer$c$1 implements NNPr {
   public long L() {
      return this.N;
   }

   MinecraftServer$c$1(NNNNst var1, long var2, int var4) {
      this.u = var1;
      this.N = var2;
      this.L = var4;
   }

   public String i() {
      return "";
   }

   public int u() {
      return this.L;
   }

   public int y() {
      return this.u.y;
   }

   public long N() {
      return this.u.N;
   }

   public List<NNWP> N(String var1) {
      return Collections.emptyList();
   }

   public boolean N(Path var1) {
      return false;
   }
}
