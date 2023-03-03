package mapper;

import com.investec.ums.dto.AddressDTO;
import com.investec.ums.dto.UserDTO;
import com.investec.ums.dto.UserDetailsRequestDTO;
import com.investec.ums.entity.Address;
import com.investec.ums.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MapperUtil {

    public static User buildUser(UserDetailsRequestDTO requestDTO){
        return User.builder().firstName(requestDTO.getFirstName())
                .lastName(requestDTO.getLastName())
                .idNumber(requestDTO.getIdNumber())
                .address(mapAddress(requestDTO.getAddress()))
                .mobileNumber(requestDTO.getMobileNumber()).build();
    }

    public static List<Address> mapAddress(List<AddressDTO> addressDTO){
        List<Address> addressList = new ArrayList<>();
        addressDTO.forEach(new Consumer<AddressDTO>() {
            @Override
            public void accept(AddressDTO addressDTO) {

                addressList.add(buildAddress(addressDTO));
            }
        });
        return addressList;
    }

    public static Address buildAddress(AddressDTO addressDTO){
        return Address.builder().houseNo(addressDTO.getHouseNo()).buildingName(addressDTO.getBuildingName())
                .areaName(addressDTO.getAreaName()).streetName(addressDTO.getStreetName())
                .city(addressDTO.getCity()).state(addressDTO.getCity()).country(addressDTO.getCountry())
                .pin(addressDTO.getPin())
                .user(buildUser(addressDTO.getUser())).build();
    }


    public static User buildUser(UserDTO userDTO){
        return User.builder().firstName(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .idNumber(userDTO.getIdNumber())
                .address(mapAddress(userDTO.getAddress()))
                .mobileNumber(userDTO.getMobileNumber()).build();
    }

    public static List<UserDTO> buildUsersDTO(List<User> users){
        List<UserDTO> userDTOS = new ArrayList<>();
        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                userDTOS.add(buildUserDTO(user));
            }
        });
       return userDTOS;
    }

   /* public static UserDTO buildUserDTO(User user){
        return UserDTO.builder().firstName(user.getFirstName())
                .lastName(user.getLastName())
                .idNumber(user.getIdNumber())
                .address(mapAddress(user.getAddress()))
                .mobileNumber(user.getMobileNumber()).build();
    }*/

    public static List<AddressDTO> mapAddressesDTO(List<Address> address){
        List<AddressDTO> addressList = new ArrayList<>();
        address.forEach(new Consumer<Address>() {
            @Override
            public void accept(Address address) {

                addressList.add(buildAddressDTO(address));
            }
        });
        return addressList;
    }

    public static AddressDTO buildAddressDTO(Address address){
        return AddressDTO.builder().houseNo(address.getHouseNo()).buildingName(address.getBuildingName())
                .areaName(address.getAreaName()).streetName(address.getStreetName())
                .city(address.getCity()).state(address.getCity()).country(address.getCountry())
                .pin(address.getPin())
                .user(buildUserDTO(address.getUser())).build();
    }


    public static UserDTO buildUserDTO(User user){
        return UserDTO.builder().firstName(user.getFirstName())
                .lastName(user.getLastName())
                .idNumber(user.getIdNumber())
                .address(mapAddressesDTO(user.getAddress()))
                .mobileNumber(user.getMobileNumber()).build();
    }




}
