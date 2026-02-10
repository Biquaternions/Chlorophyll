<div align="center">

<img src="assets/chlorophyll.png" alt="Chlorophyll" width="600">

## 🍃 Chlorophyll 🍃
Chlorophyll is a [Paper](https://github.com/PaperMC/Paper)/[Pufferfish](https://github.com/pufferfish-gg/Pufferfish/) fork designed to **only** restore vanilla properties.


</div>

## License
All patches are licensed under the MIT license.

See [PaperMC/Paper](https://github.com/PaperMC/Paper), and [PaperMC/Paperweight](https://github.com/PaperMC/paperweight) for the license of material used by this project.

## Building and setting up

#### Initial setup
First, <u>clone</u> this repository. Do not download it.

Then run the following command in the root directory:

```
./gradlew applyAllPatches
```

The project is now ready for use in your IDE.

#### Creating a patch

See [CONTRIBUTING.md](CONTRIBUTING.md).

#### Compiling

Use the command `./gradlew build` to build the API and server. Compiled JARs
will be placed under `chlorophyll-api/build/libs` and `chlorophyll-server/build/libs`.
**These JARs are not used to start a server.**

To compile a server-ready paperclip jar, run `./gradlew createMojmapBundlerJar`.
To install the `chlorophyll-api` and `chlorophyll` dependencies to your local Maven repo, run `./gradlew publishToMavenLocal`. The compiled paperclip jar will be in `chlorophyll-server/build/libs`.

# Credits:

1. PaperMC Team.
2. Pufferfish Host.
3. LeavesMC Team for the patches.
4. Winds-Studio, for their auto release script.
