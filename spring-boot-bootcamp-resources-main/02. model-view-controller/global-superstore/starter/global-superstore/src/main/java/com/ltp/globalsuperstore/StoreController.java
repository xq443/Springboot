package com.ltp.globalsuperstore;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StoreController {
  List<Item> items = new ArrayList<>();
  @GetMapping("/")
  public String getForm(Model model, @RequestParam(required = false) String id){
    int idx = getIndexFromId(id);
    model.addAttribute("item", (idx == Constants.NOT_FOUND) ? new Item() : items.get(idx));
    model.addAttribute("categories", Constants.CATEGORIES);
    return "form";
  }

  @GetMapping("/inventory")
  public String getInventory(Model model){
    model.addAttribute("items", items);
    return "inventory";
  }

  @PostMapping("/submitItem")
  public String handleSubmit(Item item){
    int idx = getIndexFromId(item.getId());
    if(idx == Constants.NOT_FOUND) items.add(item);
    else items.set(idx, item);

    return "redirect:/inventory";
  }
  public int getIndexFromId(String id) {
    for (int i = 0; i < items.size(); i++) {
      if(items.get(i).getId().equals(id)) return i;
    }
    return Constants.NOT_FOUND;
  }
}
