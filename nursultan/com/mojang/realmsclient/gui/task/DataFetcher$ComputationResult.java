package com.mojang.realmsclient.gui.task;

import com.mojang.datafixers.util.Either;

record DataFetcher$ComputationResult<T>() {
   private final Either<T, Exception> value;
   final long time;

   DataFetcher$ComputationResult(Either<T, Exception> var1, long var2) {
      this.value = var1;
      this.time = var2;
   }
}
