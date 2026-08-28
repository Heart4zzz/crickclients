package net.minecraft.server.network;

import KDFzREm.AP;
import KDFzREm.Af;
import KDFzREm.Ax;
import KDFzREm.NNRc;
import KDFzREm.Ned;
import KDFzREm.NjL;
import rw.api.StackMapTable;

public class ServerCommonPacketListenerImpl implements StackMapTable {
   private final NjL N;
   private final Af y;
   private final NNRc L;
   private Ned u;

   public void L() {
      this.L.field_13987.method_14364(AP.N(this.N.method_5667(), this.y, this.u));
   }

   public ServerCommonPacketListenerImpl(NjL var1, Af var2, NNRc var3) {
      this.N = var1;
      this.L = var3;
      this.y = var2;
      this.u = var1.method_24515();
   }

   public void i() {
      Ned var1 = this.N.method_24515();
      if (var1.method_19455(this.u) > 0) {
         this.L.field_13987.method_14364(AP.y(this.N.method_5667(), this.y, var1));
         this.u = var1;
      }
   }

   public void u() {
      this.L.field_13987.method_14364(AP.N(this.N.method_5667()));
   }

   public boolean isSingleplayerOwner() {
      return StackMapTable.super.m2000() || Ax.N(this.N, this.L);
   }

   public int keepAlivePending() {
      return this.u.method_19455(this.N.method_24515());
   }
}
