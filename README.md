<div align="center">

## 🍃 Chlorophyll 🍃
Chlorophyll is a [Paper](https://github.com/PaperMC/Paper)/[Pufferfish](https://github.com/pufferfish-gg/Pufferfish/) fork designed to **only** restore vanilla properties.


</div>

> [!WARNING]
> This project restores vanilla mechanics \
> While this means technical builds will work again, it also means:
> 
> 1. Performance degradation compared to Paper
> 2. Exploits, even server crashing ones, will also be reintroduced
> 
> Therefore, this project is not meant for a production-ready public server \
> Its usage should be limited to small and closed communities.
> 
> There will be NO SUPPORT for crashing exploits. \
> You can still ask for vanilla parity features.
> 

## Design

The aim of this project is to restore the vanilla behavior gameplay-wise in pure survival. \
Therefore, any deviation from vanilla in terms of creative or spectator modes is ignored.
Same for cosmetic aspects like nametags, or chat limitations.

Most of the "restoration" can already be achieved via following [Paper's guide](https://docs.papermc.io/paper/vanilla),
which is based on [Earthcomputer's compilation](https://gist.github.com/Earthcomputer/2296da33b8cc91dba81b48103c0e1fe3)
of vanilla changes.

As such, Chlorophyll does not work as a drop-in replacement for an existing Paper server. \
If the server already exists, you need to delete `spigot.yml`, `config/paper-global.yml` and `config/paper-world.yml`.

What couldn't be achieved via configurations, was made into patches. \
This includes void trading, hopper optimizations, entity tracking, etc.

## Patches

Patches up to Leaves' #0146 (except #0099) have been validated and implemented. \
The validation has been made by comparing it with Paper repo and a decompiled vanilla jar.

Not all Leaves vanilla-looking patches have been implemented, as some re-introduce old bugs, which were
fixed by Mojang and are no longer considered "vanilla", and #0099 requires additional validation
before implementing it.

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
