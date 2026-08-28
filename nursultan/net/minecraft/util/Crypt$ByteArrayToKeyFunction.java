package net.minecraft.util;

import KDFzREm.NNfO;
import java.security.Key;

interface Crypt$ByteArrayToKeyFunction<T extends Key> {
   T apply(byte[] var1) throws NNfO;
}
