package net.manametal.oapi.api.api;

import java.util.Objects;

import club.someoneice.json.node.MapNode;
import club.someoneice.json.processor.JsonBuilder;
import net.minecraft.item.ItemStack;

public class M3Commdity {
  public final ItemStack commdity;
  public final int price;
  
  public M3Commdity(final ItemStack commdity, final int price) {
    this.commdity = commdity;
    this.price = price;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(commdity, price);
  }
  
  @Override
  public boolean equals(Object obj) {
    return obj.hashCode() == this.hashCode();
  }
  
  @Override
  public String toString() {
    final MapNode node = new MapNode();
    node.put("item", this.commdity.getDisplayName());
    node.put("price", this.price);
    return JsonBuilder.asString(node);
  }
}
