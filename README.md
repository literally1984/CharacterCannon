# CharacterCannon
Make any character(s) print out as many times as you want.

IMPORTANT:

This program utilizes ANSI escape codes, which are used to clear the console.

If the software you are using to run this program doesn't support ANSI escape codes, then remove System.out.print("\033[H\033[2J"); from lines 4 and 29.

Usually, Linux based shells support these codes, and Windows based shells do not, so, for example, if you're using the Eclipse IDE on Mac or Linux, then the codes will work. If you're using Eclipse on Windows, they will not work.
