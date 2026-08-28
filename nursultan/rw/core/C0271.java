package rw.core;

import java.awt.geom.PathIterator;
import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.operation.polygonize.Polygonizer;
import org.locationtech.jts.operation.union.UnaryUnionOp;

final class C0271 {
   private static final double f1000 = 6.0E-4;
   private static final double f2000 = 1.0E-7;
   private static final GeometryFactory f3000 = new GeometryFactory();

   private C0271() {
   }

   private static void m2000(List<Coordinate[]> var0, List<Coordinate> var1) {
      if (var1 != null && var1.size() >= 3) {
         Coordinate var2 = (Coordinate)var1.get(0);
         Coordinate var3 = (Coordinate)var1.get(var1.size() - 1);
         if (var2.x != var3.x || var2.y != var3.y) {
            var1.add(new Coordinate(var2.x, var2.y));
         }

         if (var1.size() >= 4) {
            var0.add(var1.toArray(new Coordinate[0]));
         }
      }
   }

   private static long m4000(Geometry var0) {
      long var1 = C0265.m8000();

      for (int var3 = 0; var3 < var0.getNumGeometries(); var3++) {
         if (var0.getGeometryN(var3) instanceof Polygon var4) {
            m6000(var1, var4.getExteriorRing().getCoordinates());

            for (int var6 = 0; var6 < var4.getNumInteriorRing(); var6++) {
               m6000(var1, var4.getInteriorRingN(var6).getCoordinates());
            }
         }
      }

      return var1;
   }

   private static void m6000(long var0, Coordinate[] var2) {
      if (var2.length >= 4) {
         long var3 = C0265.m2000(var0);

         for (int var5 = 0; var5 < var2.length - 1; var5++) {
            Coordinate var6 = var2[var5];
            Coordinate var7 = var2[var5 + 1];
            if (Math.abs(var6.x - var7.x) >= 1.0E-7 || Math.abs(var6.y - var7.y) >= 1.0E-7) {
               C0265.m36000(var3, var6.x, var6.y, var7.x, var7.y);
            }
         }
      }
   }

   private static List<Coordinate[]> m8000(Double var0) {
      ArrayList var1 = new ArrayList();
      PathIterator var2 = var0.getPathIterator(null, 6.0E-4);
      double[] var3 = new double[6];

      ArrayList var4;
      for (var4 = null; !var2.isDone(); var2.next()) {
         switch (var2.currentSegment(var3)) {
            case 0:
               m2000(var1, var4);
               var4 = new ArrayList();
               var4.add(new Coordinate(var3[0], var3[1]));
               break;
            case 1:
               if (var4 != null) {
                  var4.add(new Coordinate(var3[0], var3[1]));
               }
            case 2:
            case 3:
            default:
               break;
            case 4:
               m2000(var1, var4);
               var4 = null;
         }
      }

      m2000(var1, var4);
      return var1;
   }

   static long m10000(long var0) {
      Double var2 = C0265.m6000(var0);
      if (var2 == null) {
         return 0L;
      } else {
         List var3 = m8000(var2);
         if (var3.isEmpty()) {
            return 0L;
         } else {
            ArrayList var4 = new ArrayList(var3.size());

            for (Coordinate[] var6 : var3) {
               var4.add(f3000.createLineString(var6));
            }

            Geometry var14;
            try {
               var14 = f3000.buildGeometry(var4).union();
            } catch (RuntimeException var13) {
               return 0L;
            }

            Polygonizer var15 = new Polygonizer();
            var15.add(var14);
            Collection var7 = var15.getPolygons();
            if (var7.isEmpty()) {
               return 0L;
            } else {
               ArrayList var8 = new ArrayList();

               for (Polygon var10 : var7) {
                  Point var11 = var10.getInteriorPoint();
                  if (m14000(var11.getX(), var11.getY(), var3) != 0) {
                     var8.add(var10);
                  }
               }

               if (var8.isEmpty()) {
                  return 0L;
               } else {
                  Geometry var16;
                  try {
                     var16 = UnaryUnionOp.union(var8);
                  } catch (RuntimeException var12) {
                     var16 = f3000.buildGeometry(var8).buffer(0.0);
                  }

                  return var16 != null && !var16.isEmpty() ? m4000(var16) : 0L;
               }
            }
         }
      }
   }

   private static double m12000(Coordinate var0, Coordinate var1, double var2, double var4) {
      return (var1.x - var0.x) * (var4 - var0.y) - (var2 - var0.x) * (var1.y - var0.y);
   }

   private static int m14000(double var0, double var2, List<Coordinate[]> var4) {
      int var5 = 0;

      for (Coordinate[] var7 : var4) {
         for (int var8 = 0; var8 < var7.length - 1; var8++) {
            Coordinate var9 = var7[var8];
            Coordinate var10 = var7[var8 + 1];
            if (var9.y <= var2) {
               if (var10.y > var2 && m12000(var9, var10, var0, var2) > 0.0) {
                  var5++;
               }
            } else if (var10.y <= var2 && m12000(var9, var10, var0, var2) < 0.0) {
               var5--;
            }
         }
      }

      return var5;
   }
}
