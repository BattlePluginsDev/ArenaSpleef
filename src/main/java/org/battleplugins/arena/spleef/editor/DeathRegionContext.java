package org.battleplugins.arena.spleef.editor;

import io.papermc.paper.math.Position;
import org.battleplugins.arena.Arena;
import org.battleplugins.arena.editor.ArenaEditorWizard;
import org.battleplugins.arena.editor.EditorContext;
import org.battleplugins.arena.spleef.arena.SpleefMap;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;

public class DeathRegionContext extends EditorContext<DeathRegionContext> {
    private SpleefMap map;
    private Position min;
    private Position max;

    public DeathRegionContext(ArenaEditorWizard<DeathRegionContext> wizard, Arena arena, Player player) {
        super(wizard, arena, player);
    }

    public SpleefMap getMap() {
        return this.map;
    }

    public void setMap(SpleefMap map) {
        this.map = map;
    }

    public Position getMin() {
        return this.min;
    }

    public void setMin(Position min) {
        this.min = min;
    }

    public Position getMax() {
        return this.max;
    }

    public void setMax(Position max) {
        this.max = max;
    }

    @Override
    public boolean isComplete() {
        return this.map != null && this.min != null && this.max != null;
    }
}
