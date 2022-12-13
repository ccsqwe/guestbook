ckagecom.jadecross.guestbook;
importstaticorg.junit.jupiter.api.Assertions.assertEquals; importorg.junit.jupiter.api.Test;
classPostTest{ @Test voidtestSetName() { Post post= newPost("TESTER", "2022-04-12 01:01:48", "Happy Wedding"); post.setName("DEVOPS"); assertEquals("DEVOPS", post.getName()); } }

