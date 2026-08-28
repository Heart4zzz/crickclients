package rw.core;

import KDFzREm.NNNgT;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;

class C0474 extends SnapshotParticipant<Integer> {
   C0474(NNNgT var1) {
      this.f1000 = var1;
   }

   protected void m2000(Integer var1) {
      this.f1000.R = var1;
   }

   protected Integer m4000() {
      return this.f1000.R;
   }

   public void onFinalCommit() {
      this.f1000.N(this.f1000.R);
   }
}
