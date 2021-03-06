/**
 * Copyright 2017 Lending Club, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lendingclub.mercator.aws;

public class EC2ScannerGroup extends AWSScannerGroup {

	public EC2ScannerGroup(AWSScannerBuilder builder) {
		super(builder);

		addScannerType(AccountScanner.class);
		addScannerType(RegionScanner.class);
		addScannerType(AvailabilityZoneScanner.class);

		addScannerType(SubnetScanner.class);

		addScannerType(VPCEndpointScanner.class);
		addScannerType(VPCScanner.class);
		addScannerType(SecurityGroupScanner.class);
		addScannerType(AMIScanner.class);
		addScannerType(EC2InstanceScanner.class);
		addScannerType(NetworkInterfaceScanner.class);
		addScannerType(VPCPeeringConnectionScanner.class);
		addScannerType(VpnGatewayScanner.class);
		addScannerType(InternetGatewayScanner.class);
		addScannerType(RouteTableScanner.class);
	}

}
