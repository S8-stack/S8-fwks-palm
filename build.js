const ROOT = build({
	module: "com.s8.fwks.palm",
	dependencies: [
		"S8-api",
		
		"S8-core-io-xml",
		"S8-core-io-JSON",
		"S8-core-io-bytes",
		
		"S8-core-bohr-atom",
		"S8-core-bohr-beryllium",
		"S8-core-bohr-lithium",
		"S8-core-bohr-neodymium",
		"S8-core-bohr-neon",
		
		"S8-core-arch-silicon",
		"S8-core-arch-titanium",
		
		"S8-core-db-tellurium",
		"S8-core-db-cobalt",
		"S8-core-db-copper",
		
		"S8-core-web-helium",
		"S8-core-web-carbon",
		"S8-core-web-manganese",
		"S8-core-web-xenon",
		
		"S8-pkgs-ui-carbide",
		"S8-pkgs-people"
	],
	target: "S8-fwks-palm"
});