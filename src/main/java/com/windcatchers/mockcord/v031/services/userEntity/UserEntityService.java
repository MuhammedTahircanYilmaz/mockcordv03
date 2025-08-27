package com.windcatchers.mockcord.v031.services.userEntity;

import com.windcatchers.mockcord.v031.domain.entities.UserEntity;

import java.util.List;

public interface UserEntityService {
    UserEntityCreateResponseDto create(UserEntityCreateRequestDto dto);
    UserEntityUpdateResponseDto update(UserEntityUpdateRequestDto dto);
    UserEntityDeleteResponseDto delete(UserEntityDeleteRequestDto dto);
    List<UserEntityGetResponseDto> getAll();
    List<UserEntityGetResponseDto> getByUsername(UserEntityGetByUsernameRequestDto dto)
    UserEntityGetResponseDto getByUserId(UserEntityGetByIdRequestDto dto);
}
