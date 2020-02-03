package net.minecraft.block.trees;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class BirchTree extends Tree {
   @Nullable
   protected ConfiguredFeature<TreeFeatureConfig, ?> func_225546_b_(Random p_225546_1_) {
      return Feature.NORMAL_TREE.func_225566_b_(DefaultBiomeFeatures.field_226812_g_);
   }
}