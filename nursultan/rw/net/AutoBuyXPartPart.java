package rw.net;

import KDFzREm.NNuU;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.core.C1188;
import rw.data.Rec0213;
import rw.setting.C0106;

public class AutoBuyXPartPart extends SimpleChannelInboundHandler<TextWebSocketFrame> {
   public static Object[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static String[] f6000;

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[8];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((1 | -1) >>> 31);
      f4000[7] = (boolean)((1 | -1) >>> 31);
   }

   public AutoBuyXPartPart(AutoBuyX var1) {
      this.m18000();
      this.f2000[f3000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f6000 = new String[2];
      f6000[(0 | -0) >>> 31] = "auto-buy-s2c-connected";
      f6000[(1 | -1) >>> 31] = "auto-buy-s2c-disconnected";
   }

   private static void m12000() {
      f1000 = new Object[f4000[7]];
   }

   private void m18000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f4000[6]];
         Object[] var1 = this.f2000;
      }
   }

   public void m22000(ChannelHandlerContext var1, TextWebSocketFrame var2) {
      String var3 = var2.text();
      NNuU.Nq().execute(() -> NursultanClient.m8000().m12000(new Rec0213(var3)));
   }

   private static void m26000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      ((AutoBuyX)this.f2000[f3000[3]]).m58000().set(f4000[4]);
      ((Logger)f1000[f3000[4]]).error(var2, var2);
      var1.close();
   }

   public void channelActive(ChannelHandlerContext var1) {
      ((AutoBuyX)this.f2000[f3000[1]]).m58000().set(f5000[0]);
      String var10000 = f6000[0];
      Object[] var10001 = new Object[f5000[1]];
      var10001[f4000[0]] = var1.channel().remoteAddress();
      C0106.m32000(C1188.m16000(var10000, var10001));
   }

   public void channelInactive(ChannelHandlerContext var1) {
      ((AutoBuyX)this.f2000[f3000[2]]).m58000().set(f4000[1]);
      String var10000 = f6000[1];
      Object[] var10001 = new Object[f4000[2]];
      var10001[f4000[3]] = var1.channel().remoteAddress();
      C0106.m32000(C1188.m16000(var10000, var10001));
   }
}
