package feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketplace.marketplacelisting.entity.User;

@FeignClient("user")
public interface UserClient {

	@RequestMapping(method = RequestMethod.GET, value = "/v1/users")
	List<User> getUsers();

//    @RequestMapping(method = RequestMethod.GET, value = "/stores")
//    Page<Store> getStores(Pageable pageable);
//
//    @RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
//    Store update(@PathVariable("storeId") Long storeId, Store store);
}
