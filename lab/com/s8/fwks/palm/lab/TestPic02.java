package com.s8.fwks.palm.lab;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import com.s8.api.web.S8WebVertex;

public class TestPic02 {

	public static void main(String[] args) throws IOException {

		Path path = Path.of("/Users/pc/Desktop/picture.png");
		FileChannel channel = FileChannel.open(path, new OpenOption[]{ 
				StandardOpenOption.READ
		});

		/**
		 * lexicon
		 */

		ByteBuffer buff = ByteBuffer.allocate(1024);

		while (channel.read(buff) > 0) {
			System.out.write(buff.array(), 0, buff.position());
			buff.clear();
		}

		channel.close();

		S8WebVertex vx = null;
		vx.outbound().set

	}

}
