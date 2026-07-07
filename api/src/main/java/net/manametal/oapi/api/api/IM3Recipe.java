package net.manametal.oapi.api.api;

import club.someoneice.togocup.tags.Ingredient;
import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;


public interface IM3Recipe {
  /**
   * 参与合成的物品组。
   */
  ImmutableList<Ingredient> getInputs();

  /**
   * 合成输出物品。
   */
  ImmutableList<ItemStack> getOutputs();

  class IRecipeType {
    private final ResourceLocation tileEntity;
    private final String name;

    public IRecipeType(@Nullable ResourceLocation tileEntity, String name) {
      this.tileEntity = tileEntity;
      this.name = name;
    }
  }
}
