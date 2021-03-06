/**
 * Copyright 2016 AT&T
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.att.aro.core.packetreader;

import com.att.aro.core.packetreader.pojo.Packet;

/**
 * Defines a listener that is used to listen for incoming packets.
 */
public interface IPacketListener {
	/**
	 * A method that is invoked for each received packet.
	 * 
	 * @param appName The name of the application that generated the packet or
	 * null if not known.
	 * @param packet
	 *            - The packet that is received.
	 */
	void packetArrived(String appName, Packet packet);
}
