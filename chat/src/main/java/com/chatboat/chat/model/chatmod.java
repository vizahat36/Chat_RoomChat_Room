package com.chatboat.chat.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class chatmod {

    private Long id;
    private String sender;
    private String content;
}
