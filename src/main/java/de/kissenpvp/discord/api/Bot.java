/*
 * KissenEssentials
 * Copyright (C) KissenEssentials team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.kissenpvp.discord.api;

import de.kissenpvp.api.base.Implementation;
import org.javacord.api.entity.server.Server;
import org.javacord.api.interaction.SlashCommandBuilder;
import org.javacord.api.listener.GloballyAttachableListener;

/**
 * Main class for the best discord-bot that exists in the universe north-west of New Hanover at least.
 *
 * @author Taubsie
 * @since 1.0.0
 */
public interface Bot extends Implementation
{
    void stop();

    void restart();

    void reloadBot();

    void reloadConfig();

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    boolean isEnabled();

    boolean isConnected();

    Server getServer();

    void registerListener(GloballyAttachableListener globallyAttachableListener);

    void addCommand(SlashCommandBuilder slashCommandBuilder);
}