package com.fastcampus.boardServer.Service;

import com.fastcampus.boardServer.dto.UserDTO;
import org.springframework.stereotype.Service;


public interface UserService {

    void register(UserDTO userProfile);

    UserDTO login(String id, String password);

    boolean isDuplicatedId(String id);

    UserDTO getUserInfo(String userId);

    void updatePassword(String id, String beforePassword, String afterPassword );

    void deleteId (String id, String password);
}
