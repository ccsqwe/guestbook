package com.jadecross.guestbook; 

import static org.junit.jupiter.api.Assertions.assertEquals;
 import org.junit.jupiter.api.Test;
classPostTest{ @Test voidtestSetName() { Post post= newPost("TESTER", "2022-04-12 01:01:48", "Happy Wedding"); post.setName("DEVOPS"); assertEquals("DEVOPS", post.getName()); } }

