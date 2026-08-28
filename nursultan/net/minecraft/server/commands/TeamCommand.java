package net.minecraft.server.commands;

import KDFzREm.NNJg;
import KDFzREm.NNKE;
import KDFzREm.NNNwS;
import KDFzREm.NNPQ;
import KDFzREm.NNYH;
import KDFzREm.NNfc;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkG;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import rw.api.Iface0179;
import rw.api.Iface0180;
import rw.core.C0249;
import rw.core.C0250;
import rw.core.C0251;
import rw.core.C0254;
import rw.defs.Enum0013;
import rw.defs.Enum0016;
import rw.gui.WheelTweak;

public class TeamCommand {
   public static WheelTweak N;
   private static NNuU L;
   private static NNYH u;
   private static Iface0179 i;
   private static boolean R;
   private static NYj M;
   private static double B;
   private static boolean Z;
   private static boolean z;
   private static boolean U;
   private static boolean E;

   public static boolean L(NNYH var0, double var1, double var3, Enum0016 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         NYj var6 = i.m16000(var1, var3);
         if (var6 == M) {
            return false;
         } else {
            NQo var7 = ((NkG)((NNNwS)L.T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M();
            if (z && var5 == Enum0016.right && !U) {
               U = true;
               i.m4000();
               N(M, var7);
            }

            M = var6;
            if (var6 == null) {
               return false;
            } else if (i.m6000(var6)) {
               return false;
            } else {
               if (var5 == Enum0016.left) {
                  if (!Z) {
                     return false;
                  }

                  NQo var8 = var6.i();
                  if (var8.R()) {
                     return false;
                  }

                  boolean var9 = NNPQ.N(L.Nt(), 340) || NNPQ.N(L.Nt(), 344);
                  if (var7.R()) {
                     if (!N.f5000 || !var9) {
                        return false;
                     }

                     i.m14000(var6, Enum0016.left, true);
                  } else {
                     if (!N.f4000) {
                        return false;
                     }

                     if (!N(var8, var7)) {
                        return false;
                     }

                     if (var9) {
                        i.m14000(var6, Enum0016.left, true);
                     } else {
                        if (var7.c() + var8.c() > var7.U()) {
                           return false;
                        }

                        i.m14000(var6, Enum0016.left, false);
                        if (!i.m12000(var6)) {
                           i.m14000(var6, Enum0016.left, false);
                        }
                     }
                  }
               } else if (var5 == Enum0016.right) {
                  if (!z) {
                     return false;
                  }

                  N(var6, var7);
               }

               return false;
            }
         }
      }
   }

   public static boolean y(NNYH var0, double var1, double var3, Enum0016 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         if (var5 == Enum0016.left) {
            Z = false;
         } else if (var5 == Enum0016.right) {
            z = false;
         }

         return false;
      }
   }

   private static Iface0179 y(NNYH var0) {
      if (var0 instanceof Iface0180) {
         return new C0254((Iface0180)var0);
      } else if (var0 instanceof NNKE) {
         return new C0250((NNKE)var0);
      } else {
         return var0 instanceof NNJg ? new C0249((NNJg)var0) : null;
      }
   }

   public static boolean N(NNYH var0, double var1, double var3, double var5) {
      N(var0);
      if (i != null && !R && N.f6000) {
         NYj var7 = i.m16000(var1, var3);
         if (var7 != null && !i.m6000(var7)) {
            NQo var8 = var7.i();
            if (var8.B() instanceof NNfc) {
               return false;
            } else {
               double var9 = N.f9000.m8000(var5);
               if (B != 0.0 && Math.signum(var9) != Math.signum(B)) {
                  B = 0.0;
               }

               B += var9;
               int var11 = (int)B;
               B -= var11;
               if (var11 == 0) {
                  return true;
               } else {
                  List var12 = i.m2000();
                  int var13 = Math.abs(var11);
                  boolean var14 = var11 < 0;
                  if (N.f8000.m2000() && N(var7, var12)) {
                     var14 = !var14;
                  }

                  if (N.f8000.m8000()) {
                     var14 = !var14;
                  }

                  if (var8.R()) {
                     return true;
                  } else {
                     NQo var15 = ((NkG)((NNNwS)L.T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M();
                     if (i.m12000(var7)) {
                        if (!N(var8, var15)) {
                           return true;
                        } else {
                           if (var15.R()) {
                              if (!var14) {
                                 return true;
                              }

                              while (var13-- > 0) {
                                 List var24 = N(var12, var7, var8.c(), true);
                                 if (var24 == null) {
                                    break;
                                 }

                                 i.m14000(var7, Enum0016.left, false);

                                 for (int var26 = 0; var26 < var24.size(); var26++) {
                                    NYj var28 = (NYj)var24.get(var26);
                                    if (var26 == var24.size() - 1) {
                                       i.m14000(var28, Enum0016.left, false);
                                    } else {
                                       int var31 = var28.b_(var28.i()) - var28.i().c();

                                       while (var31-- > 0) {
                                          i.m14000(var28, Enum0016.right, false);
                                       }
                                    }
                                 }
                              }
                           } else {
                              while (var13-- > 0) {
                                 i.m14000(var7, Enum0016.left, false);
                              }
                           }

                           return true;
                        }
                     } else if (!var15.R() && N(var8, var15)) {
                        return true;
                     } else if (var14) {
                        if (!var15.R() && !var7.N(var15)) {
                           return true;
                        } else {
                           var13 = Math.min(var13, var8.c());
                           List var23 = N(var12, var7, var13, false);
                           if (!y && var23 == null) {
                              throw new AssertionError();
                           } else if (var23.isEmpty()) {
                              return true;
                           } else {
                              i.m14000(var7, Enum0016.left, false);

                              for (NYj var27 : var23) {
                                 int var29 = var27.b_(var27.i()) - var27.i().c();
                                 var29 = Math.min(var29, var13);
                                 var13 -= var29;

                                 while (var29-- > 0) {
                                    i.m14000(var27, Enum0016.right, false);
                                 }
                              }

                              i.m14000(var7, Enum0016.left, false);
                              return true;
                           }
                        }
                     } else {
                        int var16 = var7.b_(var8) - var8.c();
                        var13 = Math.min(var13, var16);

                        while (var13 > 0) {
                           NYj var17 = N(var12, var7);
                           if (var17 == null) {
                              break;
                           }

                           int var18 = var17.i().c();
                           if (i.m12000(var17)) {
                              if (var16 < var18) {
                                 break;
                              }

                              var16 -= var18;
                              var13 = Math.min(var13 - 1, var16);
                              if (!var15.R() && !var7.N(var15)) {
                                 break;
                              }

                              i.m14000(var7, Enum0016.left, false);
                              i.m14000(var17, Enum0016.left, false);
                              i.m14000(var7, Enum0016.left, false);
                           } else {
                              int var19 = Math.min(var13, var18);
                              var16 -= var19;
                              var13 -= var19;
                              if (!var15.R() && !var17.N(var15)) {
                                 break;
                              }

                              i.m14000(var17, Enum0016.left, false);
                              if (var19 == var18) {
                                 i.m14000(var7, Enum0016.left, false);
                              } else {
                                 for (int var20 = 0; var20 < var19; var20++) {
                                    i.m14000(var7, Enum0016.right, false);
                                 }
                              }

                              i.m14000(var17, Enum0016.left, false);
                           }
                        }

                        return true;
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean N(NQo var0, NQo var1) {
      return var0.R() || var1.R() || NQo.y(var0, var1) && NQo.L(var0, var1);
   }

   private static NYj N(List<NYj> var0, NYj var1) {
      int var2;
      int var3;
      byte var4;
      if (N.f7000 == Enum0013.f1000) {
         var2 = 0;
         var3 = var0.size();
         var4 = 1;
      } else {
         var2 = var0.size() - 1;
         var3 = -1;
         var4 = -1;
      }

      NQo var5 = var1.i();
      boolean var6 = var1.L != ((NNNwS)L.T[4]).method_31548();

      for (int var7 = var2; var7 != var3; var7 += var4) {
         NYj var8 = (NYj)var0.get(var7);
         if (!i.m6000(var8)) {
            boolean var9 = var8.L == ((NNNwS)L.T[4]).method_31548();
            if (var6 == var9) {
               NQo var10 = var8.i();
               if (!var10.R() && N(var5, var10)) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   private static List<NYj> N(List<NYj> var0, NYj var1, int var2, boolean var3) {
      NQo var4 = var1.i();
      boolean var5 = var1.L != ((NNNwS)L.T[4]).method_31548();
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();

      for (int var8 = 0; var8 != var0.size() && var2 > 0; var8++) {
         NYj var9 = (NYj)var0.get(var8);
         if (!i.m6000(var9)) {
            boolean var10 = var9.L == ((NNNwS)L.T[4]).method_31548();
            if (var5 == var10 && !i.m12000(var9)) {
               NQo var11 = var9.i();
               if (var11.R()) {
                  if (var9.N(var4)) {
                     var7.add(var9);
                  }
               } else if (N(var4, var11) && var11.c() < var9.b_(var11)) {
                  var6.add(var9);
                  var2 -= Math.min(var2, var9.b_(var11) - var11.c());
               }
            }
         }
      }

      for (int var12 = 0; var12 != var7.size() && var2 > 0; var12++) {
         NYj var13 = (NYj)var7.get(var12);
         var6.add(var13);
         var2 -= Math.min(var2, var13.y());
      }

      return var3 && var2 > 0 ? null : var6;
   }

   public static boolean N(NNYH var0, double var1, double var3, Enum0016 var5) {
      N(var0);
      if (i == null) {
         return false;
      } else {
         M = i.m16000(var1, var3);
         NQo var6 = ((NkG)((NNNwS)L.T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M();
         if (var5 == Enum0016.left) {
            if (var6.R()) {
               Z = true;
            }
         } else if (var5 == Enum0016.right) {
            if (var6.R()) {
               return false;
            }

            if (!N.f3000) {
               return false;
            }

            z = true;
            U = false;
         }

         return false;
      }
   }

   private static void N(NYj var0, NQo var1) {
      if (var0 != null) {
         if (!var1.R()) {
            if (!i.m6000(var0)) {
               if (!i.m12000(var0)) {
                  if (!(var1.B() instanceof NNfc)) {
                     NQo var2 = var0.i();
                     if (!N(var2, var1)) {
                        return;
                     }

                     if (var2.c() == var0.b_(var2)) {
                        return;
                     }
                  }

                  i.m14000(var0, Enum0016.right, false);
               }
            }
         }
      }
   }

   private static void N(NNYH var0) {
      if (var0 != u) {
         u = var0;
         i = null;
         M = null;
         B = 0.0;
         Z = false;
         z = false;
         U = false;
         if (u != null) {
            C0251.m2000("You have just opened a " + u.getClass().getName() + ".");
            N.m10000();
            i = y(u);
            if (i == null) {
               C0251.m2000("No valid handler found; Mouse Tweaks is disabled.");
            } else {
               boolean var1 = i.m10000();
               R = i.m8000();
               C0251.m2000(
                  "Handler: "
                     + i.getClass().getSimpleName()
                     + "; Mouse Tweaks is "
                     + (var1 ? "disabled" : "enabled")
                     + "; wheel tweak is "
                     + (R ? "disabled" : "enabled")
                     + "."
               );
               if (var1) {
                  i = null;
               }
            }
         }
      }
   }

   public static void N() {
      C0251.m4000("Main.initialize()");
      if (!E) {
         L = NNuU.Nq();
         N = new WheelTweak(((File)L.l[1]).getAbsolutePath() + File.separator + "config" + File.separator + "MouseTweaks.cfg");
         N.m10000();
         C0251.m4000("Initialized.");
         E = true;
      }
   }

   private static boolean N(NYj var0, List<NYj> var1) {
      boolean var2 = var0.L == ((NNNwS)L.T[4]).method_31548();
      int var3 = 0;
      int var4 = 0;

      for (NYj var6 : var1) {
         if (var6.L == ((NNNwS)L.T[4]).method_31548() != var2) {
            if (var6.R < var0.R) {
               var4++;
            } else {
               var3++;
            }
         }
      }

      return var4 > var3;
   }
}
