package com.example.listgame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Game> games = new ArrayList<>();
    private GameAdapter gameAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        gameAdapter = new GameAdapter(this, games);
        recyclerView = findViewById(R.id.rv_game);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(gameAdapter);
    }

    private void addData(){
        games.add(new Game("1. No Man's Sky","Adventure, Space","ABOUT THIS GAME\n" +
                "Inspired by the adventure and imagination that we love from classic science-fiction, No Man's Sky presents you with a galaxy to explore, filled with unique planets and lifeforms, and constant danger and action.\n" +
                "\n" +
                "In No Man's Sky, every star is the light of a distant sun, each orbited by planets filled with life, and you can go to any of them you choose. Fly smoothly from deep space to planetary surfaces, with no loading screens, and no limits. In this infinite procedurally generated universe, you'll discover places and creatures that no other players have seen before - and perhaps never will again.\n" +
                "Now including...\n" +
                "Play with all major updates since launch: Foundation, Pathfinder, Atlas Rises, NEXT, The Abyss, Visions, the 2.0 BEYOND update, Synthesis, Living Ship, Exo Mech, Desolation and the 3.0 update, ORIGINS, Next Generation, Companions, Expeditions, Prisms, Frontiers, Sentinel, Outlaws, Endurance and Waypoint (4.0).\n" +
                "\n" +
                "An epic voyage to the centre of a shared universe awaits, allowing you to explore, trade, fight and survive alone or with friends.\n" +
                "Embark on an epic voyage\n" +
                "At the centre of the galaxy lies a irresistible pulse which draws you on a journey towards it to learn the true nature of the cosmos. But, facing hostile creatures and fierce pirates, you'll know that death comes at a cost, and survival will be down to the choices you make over how you upgrade your ship, your weapon and suit.\n" +
                "Find your own destiny\n" +
                "Your voyage through No Man's Sky is up to you. Will you be a fighter, preying on the weak and taking their riches, or taking out pirates for their bounties? Power is yours if you upgrade your ship for speed and weaponry.\n" +
                "\n" +
                "Or a trader? Find rich resources on forgotten worlds and exploit them for the highest prices. Invest in more cargo space and you'll reap huge rewards.\n" +
                "\n" +
                "Or perhaps an explorer? Go beyond the known frontier and discover places and things that no one has ever seen before. Upgrade your engines to jump ever farther, and strengthen your suit for survival in toxic environments that would kill the unwary.\n" +
                "Share your journey\n" +
                "The galaxy is a living, breathing place. Trade convoys travel between stars, factions vie for territory, pirates hunt the unwary, and the police are ever watching. Every other player lives in the same galaxy, and you can choose to share your discoveries with them on a map that spans known space. Perhaps you will see the results of their actions as well as your own..."));

        games.add(new Game("2. ELDEN RING","Fantasy, RPG","THE NEW FANTASY ACTION RPG.\n" +
                "Rise, Tarnished, and be guided by grace to brandish the power of the Elden Ring and become an Elden Lord in the Lands Between.\n" +
                "\n• A Vast World Full of Excitement\n" +
                "A vast world where open fields with a variety of situations and huge dungeons with complex and three-dimensional designs are seamlessly connected. As you explore, the joy of discovering unknown and overwhelming threats await you, leading to a high sense of accomplishment.\n" +
                "\n• Create your Own Character\n" +
                "In addition to customizing the appearance of your character, you can freely combine the weapons, armor, and magic that you equip. You can develop your character according to your play style, such as increasing your muscle strength to become a strong warrior, or mastering magic.\n" +
                "\n• An Epic Drama Born from a Myth\n" +
                "A multilayered story told in fragments. An epic drama in which the various thoughts of the characters intersect in the Lands Between.\n" +
                "\n• Unique Online Play that Loosely Connects You to Others\n" +
                "In addition to multiplayer, where you can directly connect with other players and travel together, the game supports a unique asynchronous online element that allows you to feel the presence of others."));

        games.add(new Game("3. God of War","Action, Adventure","ABOUT THIS GAME\n" +
                "Enter the Norse realm\n" +
                "His vengeance against the Gods of Olympus years behind him, Kratos now lives as a man in the realm of Norse Gods and monsters. It is in this harsh, unforgiving world that he must fight to survive… and teach his son to do the same.\n" +
                "\n" +
                "Grasp a second chance\n" +
                "Kratos is a father again. As mentor and protector to Atreus, a son determined to earn his respect, he is forced to deal with and control the rage that has long defined him while out in a very dangerous world with his son.\n" +
                "\n" +
                "Journey to a dark, elemental world of fearsome creatures\n" +
                "From the marble and columns of ornate Olympus to the gritty forests, mountains and caves of pre-Viking Norse lore, this is a distinctly new realm with its own pantheon of creatures, monsters and gods.\n" +
                "\n" +
                "Engage in visceral, physical combat\n" +
                "With an over the shoulder camera that brings the player closer to the action than ever before, fights in God of War™ mirror the pantheon of Norse creatures Kratos will face: grand, gritty and grueling. A new main weapon and new abilities retain the defining spirit of the God of War series while presenting a vision of conflict that forges new ground in the genre.\n" +
                "PC FEATURES\n" +
                "High Fidelity Graphics\n" +
                "Striking visuals enhanced on PC. Enjoy true 4K resolution, on supported devices, [MU1] with unlocked framerates for peak performance. Dial in your settings via a wide range of graphical presets and options including higher resolution shadows, improved screen space reflections, the addition of GTAO and SSDO, and much more.\n" +
                "\n" +
                "NVIDIA® DLSS and Reflex Support\n" +
                "Quality meets performance. Harness the AI power of NVIDIA Deep Learning Super Sampling (DLSS) to boost frame rates and generate beautiful, sharp images on select Nvidia GPUs. Utilize NVIDIA Reflex low latency technology allowing you to react quicker and hit harder combos with the responsive gameplay you crave on GeForce GPUs.\n" +
                "\n" +
                "Controls Customization\n" +
                "Play your way. With support for the DUALSHOCK®4 and DUALSENSE® wireless controllers, a wide range of other gamepads, and fully customizable bindings for mouse and keyboard, you have the power to fine-tune every action to match your playstyle.\n" +
                "\n" +
                "Ultra-wide Support\n" +
                "Immerse yourself like never before. Journey through the Norse realms taking in breathtaking vistas in panoramic widescreen. With 21:9 ultra-widescreen support, God of War™ presents a cinema quality experience that further expands the original seamless theatrical vision."));

        games.add(new Game("4. MONSTER HUNTER RISE","Action, RPG","ABOUT THIS GAME\n" +
                "Rise to the challenge and join the hunt! In Monster Hunter Rise, the latest installment in the award-winning and top-selling Monster Hunter series, you’ll become a hunter, explore brand new maps and use a variety of weapons to take down fearsome monsters as part of an all-new storyline. The PC release also comes packed with a number of additional visual and performance enhancing optimizations.\n" +
                "\n" +
                "Ferocious monsters with unique ecologies\n" +
                "Hunt down a plethora of monsters with distinct behaviors and deadly ferocity. From classic returning monsters to all-new creatures inspired by Japanese folklore, including the flagship wyvern Magnamalo, you’ll need to think on your feet and master their unique tendencies if you hope to reap any of the rewards!\n" +
                "\n" +
                "Choose your weapon and show your skills\n" +
                "Wield 14 different weapon types that offer unique gameplay styles, both up-close and from long range. Charge up and hit hard with the devastating Great Sword; dispatch monsters in style using the elegant Long Sword; become a deadly maelstrom of blades with the speedy Dual Blades; charge forth with the punishing Lance; or take aim from a distance with the Bow and Bowguns. These are just a few of the weapon types available in the game, meaning you’re sure to find the play style that suits you best.\n" +
                "\n" +
                "Hunt, gather and craft your way to the top of the food chain\n" +
                "Each monster you hunt will provide materials that allow you to craft new weapons and armor and upgrade your existing gear. Go back out on the field and hunt even fiercer monsters and earn even better rewards! You can change your weapon at any of the Equipment Boxes any time, so the possibilities are limitless!\n" +
                "\n" +
                "Hunt solo or team up to take monsters down\n" +
                "The Hunter Hub offers multiplayer quests where up to four players can team up to take on targets together. Difficulty scaling ensures that whether you go solo or hit the hunt as a full four-person squad, it’s always a fair fight.\n" +
                "\n" +
                "Stunning visuals, unlocked framerate and other PC optimizations\n" +
                "Enjoy beautiful graphics at up 4K resolution, HDR with support for features including ultrawide monitors and an unlocked frame rate make to make this a truly immersive monster-hunting experience. Hunters will also get immediate access to a number of free title updates that include new monsters, quests, gear and more.\n" +
                "\n" +
                "Enjoy an exciting new storyline set in Kamura Village\n" +
                "This serene locale is inhabited by a colorful cast of villagers who have long lived in fear of the Rampage - a catastrophic event where countless monsters attack the village all at once. 50 years after the last Rampage, you must work together with the villagers to face this trial.\n" +
                "\n" +
                "Experience new hunting actions with the Wirebug\n" +
                "Wirebugs are an integral part of your hunter’s toolkit. The special silk they shoot out can be used to zip up walls and across maps, and can even be used to pull off special attacks unique to each of the 14 weapon types in the game.\n" +
                "\n" +
                "Buddies are here to help\n" +
                "The Palico Felyne friends you already know and love from previous Monster Hunter adventures are joined by the brand new Palamute Canyne companions!\n" +
                "\n" +
                "Wreak havoc by controlling monsters\n" +
                "Control raging monsters using Wyvern Riding and dish out massive damage to your targets!\n" +
                "\n" +
                "Fend off hordes of monsters in The Rampage\n" +
                "Protect Kamura Village from hordes of monsters in an all-new quest type! Prepare for monster hunting on a scale like never before!"));

        games.add(new Game("5. Marvel’s Spider-Man Remastered","Action, Superhero","ABOUT THIS GAME\n" +
                "Developed by Insomniac Games in collaboration with Marvel, and optimized for PC by Nixxes Software, Marvel's Spider-Man Remastered on PC introduces an experienced Peter Parker who’s fighting big crime and iconic villains in Marvel’s New York. At the same time, he’s struggling to balance his chaotic personal life and career while the fate of Marvel’s New York rests upon his shoulders.\n" +
                "Key Features\n" +
                "Be Greater\n" +
                "When iconic Marvel villains threaten Marvel’s New York, Peter Parker and Spider-Man’s worlds collide. To save the city and those he loves, he must rise up and be greater.\n" +
                "\n" +
                "Feel like Spider-Man\n" +
                "After eight years behind the mask, Peter Parker is a crime-fighting master. Feel the full power of a more experienced Spider-Man with improvisational combat, dynamic acrobatics, fluid urban traversal and environmental interactions.\n" +
                "\n" +
                "Worlds collide\n" +
                "The worlds of Peter Parker and Spider-Man collide in an original action-packed story. In this new Spider-Man universe, iconic characters from Peter and Spider-Man’s lives have been reimagined, placing familiar characters in unique roles.\n" +
                "\n" +
                "Marvel’s New York is your playground\n" +
                "The Big Apple comes to life in Marvel’s Spider-Man. Swing through vibrant neighborhoods and catch breathtaking views of iconic Marvel and Manhattan landmarks. Use the environment to defeat villains with epic takedowns in true blockbuster action.\n" +
                "\n" +
                "Enjoy The City That Never Sleeps complete content\n" +
                "Following the events of the main story of Marvel’s Spider-Man Remastered, experience the continuation of Peter Parker’s journey in Marvel’s Spider-Man: The City That Never Sleeps, three story chapters with additional missions and challenges to discover.\n" +
                "PC Features\n" +
                "PC Optimized Graphics\n" +
                "Enjoy a variety of graphics quality options to tailor to a wide range of devices, unlocked framerates, and support for other technologies including performance boosting NVIDIA DLSS and image quality enhancing NVIDIA DLAA. Upscaling technology AMD FSR 2.0 is also supported.\n" +
                "\n" +
                "Ray-traced reflections and improved shadows*\n" +
                "See the city come to life with improved shadows and stunning ray-traced reflection options with a variety of quality modes to choose from.\n" +
                "\n" +
                "Ultra-wide Monitor support**\n" +
                "Take in the cinematic sights of Marvel’s New York with support for a range of screen setups, including 16:9, 16:10, 21:9, 32:9, and 48:9 resolutions with triple monitor setups using NVIDIA Surround or AMD Eyefinity.\n" +
                "\n" +
                "Controls and Customization\n" +
                "Feel what it’s like to play as Spider-Man through immersive haptic feedback and dynamic trigger effects using a PlayStation DualSense™ controller on a wired USB connection. Enjoy full mouse and keyboard support with various customizable control options."));

        games.add(new Game("6. Assassin’s Creed IV Black Flag","Assasin, Pirates","ABOUT THIS GAME\n" +
                "The year is 1715. Pirates rule the Caribbean and have established their own lawless Republic where corruption, greediness and cruelty are commonplace.\n" +
                "\n" +
                "Among these outlaws is a brash young captain named Edward Kenway. His fight for glory has earned him the respect of legends like Blackbeard, but also drawn him into the ancient war between Assassins and Templars, a war that may destroy everything the pirates have built.\n" +
                "\n" +
                "Welcome to the Golden Age of Piracy.\n" +
                "Key Features\n" +
                "\n" +
                "A BRASH REBEL ASSASSIN Become Edward Kenway, a charismatic yet brutal pirate captain, trained by Assassins. Edward can effortlessly switch between the Hidden Blade of the Assassin’s Order and all new weaponry including four flintlock pistols and dual cutlass swords.\n" +
                "\n" +
                "EXPLORE AN OPEN WORLD FILLED WITH OPPORTUNITIES Discover the largest and most diverse Assassin’s Creed world ever created. From Kingston to Nassau, explore over 75 unique locations where you can live the life of a pirate including:\n" +
                "Loot underwater shipwrecks\n" +
                "Assassinate Templars in blossoming cities\n" +
                "Hunt for rare animals in untamed jungles\n" +
                "Search for treasure in lost ruins\n" +
                "Escape to hidden coves\n" +
                "\n" +
                "BECOME THE MOST FEARED PIRATE IN THE CARIBBEAN Command your ship, the Jackdaw, and strike fear in all who see her. Plunder and pillage to upgrade the Jackdaw with ammunition and equipment needed to fight off enemy ships. The ship’s improvements are critical to Edward’s progression through the game. Attack and seamlessly board massive galleons, recruit sailors to join your crew and embark on an epic and infamous adventure.\n" +
                "\n" +
                "EXPERIENCE THE GRITTY REALITY BEHIND THE PIRATE FANTASY Stand amongst legendary names such as Blackbeard, Calico Jack and Benjamin Hornigold, as you establish a lawless Republic in the Bahamas and relive the truly explosive events that defined the Golden Age of Piracy.\n" +
                "\n" +
                "THE BEST ASSASSIN’S CREED MULTIPLAYER EXPERIENCE TO DATE Put your assassination skills to test and embark on an online journey throughout the Caribbean. Discover a brand new set of pirate characters, and explore exotic and colourful locations. Additionally, create your own game experience with the new Game Lab feature – craft your own multiplayer mode by choosing abilities, rules and bonuses. Play and share your newly created mode with your friends."));

        games.add(new Game("7. Sea of Thieves","Action, Pirates","About the Game\n" +
                "Sea of Thieves offers the essential pirate experience, from sailing and fighting to exploring and looting – everything you need to live the pirate life and become a legend in your own right. With no set roles, you have complete freedom to approach the world, and other players, however you choose.\n" +
                "\n" +
                "Whether you’re voyaging as a group or sailing solo, you’re bound to encounter other crews in this shared world adventure – but will they be friends or foes, and how will you respond?\n" +
                "\n" +
                "A Vast Open World\n" +
                "Explore a vast open world filled with unspoiled islands and underwater kingdoms. Take on quests to hunt for lost loot, forge a reputation with the Trading Companies and battle foes from Phantoms and Ocean Crawlers to Megalodons and the mighty Kraken. Try your hand at fishing, make maps to your own buried treasure or choose from hundreds of other optional goals and side-quests!\n" +
                "\n" +
                "Sea of Thieves: A Pirate’s Life\n" +
                "Play the Tall Tales to experience Sea of Thieves’ unique narrative-driven campaigns, and join forces with Captain Jack Sparrow in Sea of Thieves: A Pirate’s Life, an acclaimed original story that brings Disney’s Pirates of the Caribbean sailing into Sea of Thieves. These immersive and cinematic quests provide around 30 hours of the ultimate pirate adventure.\n" +
                "\n" +
                "A Game That’s Always Growing\n" +
                "With each Season bringing in new game features every three months alongside regular in-game Events and new narrative Adventures, Sea of Thieves is a service-based game that’s still growing and evolving. Check back regularly to see what free content has been newly added, and see how far you can climb through each Season’s 100 levels of Renown to earn special rewards.\n" +
                "\n" +
                "Become Legend\n" +
                "On your journey to become a Pirate Legend you’ll amass loot, build a reputation and define a unique personal style with your hard-earned rewards. Adventurer. Explorer. Conqueror. What will your legend be?"));

    }


}
