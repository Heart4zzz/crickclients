package rw.core;

import KDFzREm.NNNUB;
import KDFzREm.NNNUi;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;

class C0438 implements FlightRecorderListener {
   C0438(NNNUi var1) {
      this.f1000 = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void recordingStateChanged(Recording var1) {
      switch (NNNUB.N[var1.getState().ordinal()]) {
         case 1:
            this.f1000.N();
         case 2:
         case 3:
         case 4:
         case 5:
      }
   }
}
