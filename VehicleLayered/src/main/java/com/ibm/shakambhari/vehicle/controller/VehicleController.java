package com.ibm.shakambhari.vehicle.controller;
import com.ibm.shakambhari.vehicle.service.*;
import com.ibm.shakambhari.domain.*;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class VehicleController {
@Autowired
VehicleService service;
@PostMapping("/add")
public void addVehicle(@RequestBody vehicle vehicle)
{
	service.addVehicle(vehicle);
}
@RequestMapping("/all")
public List<vehicle> getall()
{
	return service.getAll();
	
}
@RequestMapping("/find/{vehicleId}")
public vehicle find(@PathVariable int vehicleId)
{
	return service.find(vehicleId);
}
@DeleteMapping("/delete/{vehicleId}")
public void deleteVehicle(@PathVariable  int vehicleId)
{
	service.deleteVehicle(vehicleId);
}
@PutMapping("/update")
public void update(@RequestBody vehicle vehicle)
{
	service.updtae(vehicle);
}
//@RequestMapping(value = "search", method = { RequestMethod.POST, RequestMethod.GET })
//public List<vehicle> search(Integer seats, Double minPrice, Double maxPrice, Boolean isAvailable)
//{
//	return service.search(seats, minPrice, maxPrice, isAvailable);
//}

@RequestMapping(value = "search", method = { RequestMethod.POST, RequestMethod.GET })
public String searchVehicles(@ModelAttribute("vs") VehicleSpecs vs, BindingResult result,
	Model model) {


List<vehicle> found = this.service.search(vs.getMinSeats(), vs.getMinPrice(), vs.getMaxPrice(), null);
model.addAttribute("vehicles", found);

return "search";
}
}


